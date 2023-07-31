package com.mycompany.clickcounterui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ClickCounterUI extends JFrame {
    private final JButton clickButton;
    private final JLabel clickCountLabel;
    private int clickCount;

    public ClickCounterUI() {
        setTitle("Click Counter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        clickButton = new JButton("Click Me!");
        clickButton.addActionListener((ActionEvent e) -> {
            clickCount++;
            updateClickCountLabel();
        });

        clickCountLabel = new JLabel("Click Count: 0");
        clickCountLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
        panel.add(clickButton);
        panel.add(clickCountLabel);

        getContentPane().add(panel);
    }

    private void updateClickCountLabel() {
        clickCountLabel.setText("Click Count: " + clickCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ClickCounterUI ui = new ClickCounterUI();
            ui.setVisible(true);
        });
    }
}

