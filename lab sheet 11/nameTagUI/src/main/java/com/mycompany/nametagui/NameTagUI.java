package com.mycompany.nametagui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameTagUI extends JFrame implements ActionListener {

    private final JLabel nameLabel;
    private final JLabel firstNameLabel;
    private final JLabel lastNameLabel;
    private final JLabel titleLabel;
    private final JLabel nicknameLabel;
    private final JLabel formatLabel;
    private final JLabel emailLabel;
    private final JTextField firstNameField;
    private final JTextField lastNameField;
    private final JTextField titleField;
    private final JTextField nicknameField;
    private final JTextField emailField;
    private final JComboBox<String> formatSelector;
    private final JRadioButton htmlRadioButton;
    private final JRadioButton plainTextRadioButton;
    private final JRadioButton customRadioButton;
    private final ButtonGroup mailFormatButtonGroup;
    private final JButton addButton;
    private final JButton editButton;
    private final JButton removeButton;
    private final JButton defaultButton;
    private final JButton okButton;
    private final JButton cancelButton;

    public NameTagUI() {
        setTitle("Name Tag UI");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        nameLabel = new JLabel("Name Tag");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 24));

        firstNameLabel = new JLabel("First Name:");
        lastNameLabel = new JLabel("Last Name:");
        titleLabel = new JLabel("Title:");
        nicknameLabel = new JLabel("Nickname:");
        formatLabel = new JLabel("Display Format:");

        firstNameField = new JTextField(20);
        lastNameField = new JTextField(20);
        titleField = new JTextField(20);
        nicknameField = new JTextField(20);

        String[] formatOptions = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        formatSelector = new JComboBox<>(formatOptions);

        emailLabel = new JLabel("E-mail:");
        emailField = new JTextField(20);

        addButton = new JButton("Add");
        editButton = new JButton("Edit");
        removeButton = new JButton("Remove");
        defaultButton = new JButton("Default");

        htmlRadioButton = new JRadioButton("HTML");
        plainTextRadioButton = new JRadioButton("Plain Text");
        customRadioButton = new JRadioButton("Custom");

        mailFormatButtonGroup = new ButtonGroup();
        mailFormatButtonGroup.add(htmlRadioButton);
        mailFormatButtonGroup.add(plainTextRadioButton);
        mailFormatButtonGroup.add(customRadioButton);

        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");

        JPanel leftPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        leftPanel.add(firstNameLabel);
        leftPanel.add(firstNameField);
        leftPanel.add(lastNameLabel);
        leftPanel.add(lastNameField);
        leftPanel.add(titleLabel);
        leftPanel.add(titleField);
        leftPanel.add(nicknameLabel);
        leftPanel.add(nicknameField);
        leftPanel.add(formatLabel);
        leftPanel.add(formatSelector);
        leftPanel.add(emailLabel);
        leftPanel.add(emailField);

        JPanel rightPanel = new JPanel(new GridLayout(5, 1, 10, 10));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        rightPanel.add(addButton);
        rightPanel.add(editButton);
        rightPanel.add(removeButton);
        rightPanel.add(defaultButton);
        rightPanel.add(new JPanel()); // Empty panel for spacing

        JPanel mailFormatPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        mailFormatPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mailFormatPanel.add(htmlRadioButton);
        mailFormatPanel.add(plainTextRadioButton);
        mailFormatPanel.add(customRadioButton);

        JPanel bottomPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        bottomPanel.add(new JLabel("Mail Format:"));
        bottomPanel.add(mailFormatPanel);
        
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(nameLabel, BorderLayout.NORTH);
        mainPanel.add(leftPanel, BorderLayout.CENTER);
        mainPanel.add(rightPanel, BorderLayout.EAST);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        mainPanel.add(buttonPanel, BorderLayout.PAGE_END);

        getContentPane().add(mainPanel);
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Add your action listener logic here if needed
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NameTagUI ui = new NameTagUI();
            ui.setVisible(true);
        });
    }
}
