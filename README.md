# CS 370 Lab 3 - Random Grid Lines (JavaFX)

## Project Description

This JavaFX application opens a graphical window containing a 10x10 grid. Inside the grid, ten vertical lines are drawn with random colors and random lengths. A **Redraw** button is centered at the bottom of the window. Clicking the button generates new random colors and lengths.

## Files

- `RandomGridApp.java` - starts the JavaFX application and builds the main window.
- `GridPanel.java` - draws the 10x10 grid and displays the colored vertical lines.
- `RandomLine.java` - stores line data and generates random colors and random lengths.
- `AppController.java` - handles the Redraw button and refreshes the grid.
- `hello-view.fxml` - defines the JavaFX user interface layout.
- `module-info.java` - contains the JavaFX module configuration.
- `pom.xml` - contains the Maven and JavaFX project configuration.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure Maven dependencies are loaded.
3. Run `RandomGridApp.java`.
4. The application will display a 10x10 grid with random colored lines.
5. Click the **Redraw** button to generate new random colors and lengths.

## Team Responsibility Plan

- **Member 1:** Main window and JavaFX application setup (`RandomGridApp.java`)
- **Member 2:** 10x10 grid and line drawing (`GridPanel.java`)
- **Member 3:** Random line data, random color, and random length generation (`RandomLine.java`)
- **Member 4:** Redraw event handling, integration, testing, GitHub organization, and demo video (`AppController.java`)

All team members will review and test the final project before submission.

## Lab Requirements

The project includes:

- A graphical JavaFX window
- A 10x10 grid
- Random line colors
- Random line lengths
- A Redraw button
- GitHub project submission
