package Project_for_Finals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;

public class Signupclass {

    public Signupclass() {
        JFrame frame = new JFrame("Sign Up Form");
        JPanel panel = new JPanel();

        JLabel FirstnameLabel = new JLabel("Enter first name ");
        JLabel LastnameLabel = new JLabel("Enter Last name ");
        JLabel usernameLabel = new JLabel("Username");
        JLabel pwdLabel = new JLabel("Password");
        JLabel cnfrmpwdLabel = new JLabel("Confirm Password");
        JLabel Phonenum = new JLabel("Enter Phone Number");
        JTextField FirstnameField = new JTextField();
        JTextField LastnameField = new JTextField();
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JPasswordField passwordField1 = new JPasswordField();
        JTextField phonenumberField = new JTextField();
        JButton registerButton = new JButton("Register");
        JButton tendersButton = new JButton("View Tenders");

        FirstnameLabel.setBounds(10, 20, 100, 40);
        LastnameLabel.setBounds(300, 20, 100, 40);
        usernameLabel.setBounds(10, 60, 100, 40);
        pwdLabel.setBounds(10, 100, 100, 40);
        cnfrmpwdLabel.setBounds(10, 140, 100, 40);

        LastnameField.setBounds(400, 25, 100, 30);
        FirstnameField.setBounds(180, 20, 100, 30);
        usernameField.setBounds(180, 60, 100, 30);
        passwordField.setBounds(180, 100, 100, 30);
        passwordField1.setBounds(180, 140, 100, 30);
        registerButton.setBounds(190, 200, 130, 30);
        tendersButton.setBounds(190, 240, 130, 30);

        panel.add(FirstnameLabel);
        panel.add(LastnameLabel);
        panel.add(usernameLabel);
        panel.add(pwdLabel);
        panel.add(cnfrmpwdLabel);
        panel.add(FirstnameField);
        panel.add(LastnameField);
        panel.add(usernameField);
        panel.add(passwordField);
        panel.add(passwordField1);
        panel.add(registerButton);
        panel.add(tendersButton);

        panel.setLayout(null);

        FirstnameLabel.setForeground(Color.WHITE);
        LastnameLabel.setForeground(Color.WHITE);
        usernameLabel.setForeground(Color.WHITE);
        pwdLabel.setForeground(Color.WHITE);
        cnfrmpwdLabel.setForeground(Color.WHITE);
        panel.setBackground(Color.decode("#254252"));
        registerButton.setBackground(Color.decode("#A1B5C1"));
        tendersButton.setBackground(Color.decode("#A1B5C1"));

        frame.add(panel);
        frame.setSize(545, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                if (username.equals("Asif") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Logged-in successful");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username/password");
                }
            }
        });

       tendersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to retrieve and display tenders
                String[] tenders = { "Tender 1", "Tender 2", "Tender 3" };
                String tenderText = "";
                for (String tender : tenders) {
                    tenderText += tender + "\n";
                }
                JOptionPane.showMessageDialog(null, tenderText, "Tenders", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new Signupclass();
    }
}
