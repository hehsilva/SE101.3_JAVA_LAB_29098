package com.mycompany.colorchangerui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangerUI extends JFrame implements ActionListener {

    private final JButton blueButton;
    private final JButton redButton;
    private final JButton greenButton;
    private final JButton defaultButton;
    private final JLabel headingLabel;

    public ColorChangerUI() {
        setTitle("Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        headingLabel = new JLabel("Click to change the color");
        headingLabel.setFont(new Font("Arial", Font.BOLD, 20));

        blueButton = createButton("Blue", Color.BLUE);
        redButton = createButton("Red", Color.RED);
        greenButton = createButton("Green", Color.GREEN);
        defaultButton = createButton("Default", UIManager.getColor("Panel.background"));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(defaultButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(headingLabel, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
    }

    private JButton createButton(String label, Color color) {
        JButton button = new JButton(label);
        button.addActionListener(this);
        button.setBackground(color);
        button.setOpaque(true);
        button.setBorderPainted(false);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == blueButton) {
            getContentPane().setBackground(Color.BLUE);
        } else if (source == redButton) {
            getContentPane().setBackground(Color.RED);
        } else if (source == greenButton) {
            getContentPane().setBackground(Color.GREEN);
        } else if (source == defaultButton) {
            getContentPane().setBackground(UIManager.getColor("Panel.background"));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorChangerUI ui = new ColorChangerUI();
            ui.setVisible(true);
        });
    }
}
