import javax.swing.JButton;

/** Connects the Redraw button to the grid panel. */
public class AppController {
    private final GridPanel gridPanel;
    private final JButton redrawButton;

    public AppController(GridPanel gridPanel, JButton redrawButton) {
        this.gridPanel = gridPanel;
        this.redrawButton = redrawButton;
        connectEvents();
    }

    private void connectEvents() {
        redrawButton.addActionListener(e -> gridPanel.regenerateLines());
    }
}
