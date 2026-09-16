import java.awt.Color;
import java.util.Random;

/** Represents one randomly generated vertical line inside the 10x10 grid. */
public class RandomLine {
    private final int column;
    private final int lengthInCells;
    private final Color color;

    public RandomLine(int column, int lengthInCells, Color color) {
        this.column = column;
        this.lengthInCells = lengthInCells;
        this.color = color;
    }

    public int getColumn() {
        return column;
    }

    public int getLengthInCells() {
        return lengthInCells;
    }

    public Color getColor() {
        return color;
    }

    public static RandomLine randomLine(int column, Random random) {
        int length = random.nextInt(10) + 1;
        Color color = new Color(
                random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256));
        return new RandomLine(column, length, color);
    }
}
