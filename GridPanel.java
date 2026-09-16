import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** Draws the 10x10 grid and the random colored lines. */
public class GridPanel extends JPanel {
    private static final int GRID_SIZE = 10;
    private final Random random = new Random();
    private final List<RandomLine> lines = new ArrayList<>();

    public GridPanel() {
        setBackground(Color.WHITE);
        regenerateLines();
    }

    public void regenerateLines() {
        lines.clear();
        for (int column = 0; column < GRID_SIZE; column++) {
            lines.add(RandomLine.randomLine(column, random));
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int margin = 30;
        int availableWidth = getWidth() - 2 * margin;
        int availableHeight = getHeight() - 2 * margin;
        int gridPixels = Math.min(availableWidth, availableHeight);
        int cell = Math.max(1, gridPixels / GRID_SIZE);
        int gridWidth = cell * GRID_SIZE;
        int gridHeight = cell * GRID_SIZE;
        int startX = (getWidth() - gridWidth) / 2;
        int startY = (getHeight() - gridHeight) / 2;

        g2.setColor(Color.GRAY);
        g2.setStroke(new BasicStroke(1f));
        for (int i = 0; i <= GRID_SIZE; i++) {
            int x = startX + i * cell;
            int y = startY + i * cell;
            g2.drawLine(x, startY, x, startY + gridHeight);
            g2.drawLine(startX, y, startX + gridWidth, y);
        }

        g2.setStroke(new BasicStroke(Math.max(4f, cell * 0.18f), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        for (RandomLine line : lines) {
            int x = startX + line.getColumn() * cell + cell / 2;
            int bottomY = startY + gridHeight;
            int topY = bottomY - line.getLengthInCells() * cell;
            g2.setColor(line.getColor());
            g2.drawLine(x, bottomY - 2, x, topY + 2);
        }

        g2.dispose();
    }
}
