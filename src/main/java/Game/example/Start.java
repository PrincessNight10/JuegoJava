package Game.example;

import javax.swing.*;
import java.awt.event.WindowAdapter;

public class Start {
    public static void main(String[] args) {
        JFrame Window = new JFrame("PribcessLuna");
        Window.setVisible(true);
        Window.setSize(600, 600);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.add(new canvas ());
    }
}
