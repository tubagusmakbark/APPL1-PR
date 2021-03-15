package Week1.Speed_Control;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SpeedControl {
    // -------------------------------------
    // Sets up the frame for the animation.
    // -------------------------------------
 public void static main (String[] args)
 {
 JFrame frame = new JFrame ("Bouncing Balls");
 frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
 frame.getContentPane.add(new SpeedControlPanel ());
 frame.pack();
 frame.setVisible(true);
 }
}