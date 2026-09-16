import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

/** Main application window for CS 370 Lab 3. */
public class RandomGridApp {
    private void createAndShowGUI() {
        JFrame frame = new JFrame("Random Grid Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        GridPanel gridPanel = new GridPanel();
        gridPanel.setPreferredSize(new Dimension(560, 560));

        JButton redrawButton = new JButton("Redraw");
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        buttonPanel.add(redrawButton);

        new AppController(gridPanel, redrawButton);

        frame.add(gridPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RandomGridApp().createAndShowGUI());
    }
}
