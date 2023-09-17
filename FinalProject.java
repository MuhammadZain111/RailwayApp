package Project_for_Finals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class FinalProject {

    public static void main(String[] args) {

        // Create the main JFrame
        JFrame frame = new JFrame("Sign Up");

        // Create two JPanels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        // Create labels and button
        JLabel nameLabel = new JLabel("Name*");
        JLabel phoneLabel = new JLabel("Phone #*");
        JLabel cnicLabel = new JLabel("Cnic*");
        JLabel cityLabel = new JLabel("City*");
        JButton proceedButton = new JButton("Submit to proceed");

        // Create text fields
        JTextField nameField = new JTextField();
        JTextField phoneNumberField = new JTextField();
        JTextField cnicField = new JTextField();
        JTextField cityField = new JTextField();

        // Set label and button colors
        nameLabel.setForeground(Color.WHITE);
        phoneLabel.setForeground(Color.WHITE);
        cnicLabel.setForeground(Color.WHITE);
        proceedButton.setForeground(Color.WHITE);
        cityLabel.setForeground(Color.WHITE);

        // Set font for labels
        nameLabel.setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
        phoneLabel.setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
        cnicLabel.setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
        cityLabel.setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));

        // Set background color for the button
        proceedButton.setBackground(Color.orange);

        // Set positions and sizes for labels, text fields, and button
        nameLabel.setBounds(20, 90, 200, 25);
        nameField.setBounds(130, 85, 200, 30);

        phoneLabel.setBounds(20, 140, 200, 20);
        phoneNumberField.setBounds(130, 135, 200, 30);

        cnicLabel.setBounds(20, 190, 150, 20);
        cnicField.setBounds(130, 185, 200, 30);

        cityLabel.setBounds(20, 250, 100, 20);
        cityField.setBounds(130, 245, 200, 30);

        proceedButton.setBounds(135, 420, 200, 40);

        // Add labels, text fields, and button to panel2
        panel2.add(nameLabel);
        panel2.add(nameField);
        panel2.add(phoneLabel);
        panel2.add(phoneNumberField);
        panel2.add(cnicLabel);
        panel2.add(cnicField);
        panel2.add(cityLabel);
        panel2.add(cityField);
        panel2.add(proceedButton);

        // Add action listener to the proceedButton
        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phoneNumber = phoneNumberField.getText();
                String cnic = cnicField.getText();
                String city = cityField.getText();

                if (name.isEmpty() || phoneNumber.isEmpty() || cnic.isEmpty() || city.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all the required fields", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!name.matches("[a-zA-Z ]+")) {
                    JOptionPane.showMessageDialog(frame, "Invalid input for name field. Please enter alphabets only.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!phoneNumber.matches("[0-9 ]+") || phoneNumber.replaceAll("\\s", "").length() != 11) {
                    JOptionPane.showMessageDialog(frame, "Invalid input for phone number field. Please enter 11 digits with spaces after every 4 digits.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // All fields are filled correctly, proceed with the login
                    JOptionPane.showMessageDialog(frame, "Logged-in successfully!");

                    new Main();
                }
            }
        });

        // Set positions and sizes for panel1 and panel2
        panel1.setBounds(0, 0, 150, 800);
        panel2.setBounds(440, 150, 300, 150);

        // Set layouts and background colors for the panels
        panel2.setLayout(null);
        panel1.setBackground(Color.decode("#171C2D"));
        panel2.setBackground(Color.decode("#023246"));

        // Set frame size and visibility
        frame.setSize(1550, 950);

        // Add panel2 to panel1 and set its size
        panel1.add(panel2);
        panel2.setSize(500, 550);

        // Set layouts and visibility for panels
        panel1.setVisible(true);
        panel2.setVisible(true);

        panel1.setLayout(null);
        panel2.setLayout(null);

        // Add panel1 to the frame and set frame properties
        frame.add(panel1);
        frame.setSize(845, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Add a component listener to the frame to adjust the position of panel2 when the frame is resized
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                panel2.setLocation((frame.getWidth() - panel2.getWidth()) / 2, (frame.getHeight() - panel2.getHeight()) / 2);
            }
        });
    }
}
