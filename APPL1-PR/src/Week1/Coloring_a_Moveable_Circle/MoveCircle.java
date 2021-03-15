package Week1.Coloring_a_Moveable_Circle;

import java.awt.*;
import javax.swing.*;

public class MoveCircle {
    // -----------------------------------
    // Set up a frame for the GUI.
    // -----------------------------------
    public static void main(String[] args) {
        JFrame frame = new JFrame("MoveCircle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.getContentPane().add(new CirclePanel(400, 300));
        frame.pack();
        frame.setVisible(true);
    }
}