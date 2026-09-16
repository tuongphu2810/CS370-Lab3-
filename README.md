# CS 370 Lab 3 - Random Grid Lines

## Project Description
This Java Swing application opens a graphical window containing a 10x10 grid. Inside the grid, ten vertical lines are drawn with random colors and random lengths. A **Redraw** button is centered at the bottom of the window. Clicking the button generates new random colors and lengths.

## Files
- `RandomGridApp.java` - starts the program and builds the main window.
- `GridPanel.java` - draws the 10x10 grid and colored lines.
- `RandomLine.java` - stores line data and generates random line properties.
- `AppController.java` - connects the Redraw button to the grid refresh action.

## How to Run
From the `src` folder:

```bash
javac *.java
java RandomGridApp
```

## Team Responsibility Plan
- Member 1: Main window and application setup (`RandomGridApp.java`)
- Member 2: Grid and line drawing (`GridPanel.java`)
- Member 3: Random line data and random color/length generation (`RandomLine.java`)
- Member 4: Redraw event handling, integration, testing, GitHub organization, and demo video (`AppController.java`, testing/docs)

All members review the final project before submission.
