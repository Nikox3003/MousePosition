package me.nikox.mouseposition.window;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public static JLabel x = new JLabel("X: 0", SwingConstants.CENTER);
    public static JLabel y = new JLabel("Y: 0", SwingConstants.CENTER);

    public Window(){
        super("Mouse Position");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 100);
        setAlwaysOnTop(true);
        addComponents();
        setVisible(true);
    }

    public void addComponents(){
        setLayout(new GridLayout(2, 1));
        add(x);
        add(y);
    }
}
