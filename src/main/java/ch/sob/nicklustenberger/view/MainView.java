package main.java.ch.sob.nicklustenberger.view;

import main.java.ch.sob.nicklustenberger.view.keyboard.NumberKeyboardPanel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends NumberKeyboardPanel {

    public MainView() {

        JFrame frame = new JFrame();

        NumberKeyboardPanel numberKeyboardPanel = new NumberKeyboardPanel();
        frame.add(numberKeyboardPanel.getNumberKeyboardPanel());



        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainView());
    }
}

