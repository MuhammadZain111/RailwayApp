package Project_for_Finals;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Book_ur_ticket extends JFrame {
    private JPasswordField passwordField;
    private JLabel passwordStrengthLabel;

    Book_ur_ticket() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel login = new JLabel("Please Login to book your Seat(s)");
        JLabel mobileNo = new JLabel("Mobile No:");
        JLabel password = new JLabel("Password:");
        JLabel enterTheCode = new JLabel("Enter the Code");
        JTextField mobileNoField = new JTextField("92xxxxxxxxxx");
        passwordField = new JPasswordField();
        JButton codeText = new JButton("OOLT5");
        JTextField codeField = new JTextField();
        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");
        JButton signupButton = new JButton("Click here to Register");
        JButton recoverPassword = new JButton("Click here to recover password");
        JLabel username = new JLabel("Username");
        JTextField usernameField = new JTextField();

        passwordStrengthLabel = new JLabel();
        passwordStrengthLabel.setBounds(300, 110, 100, 30);
        panel.add(passwordStrengthLabel);

        login.setBounds(0, 0, 300, 100);
        mobileNo.setBounds(40, 40, 100, 80);
        password.setBounds(40, 80, 150, 80);
        username.setBounds(40, 100, 150, 80);
        enterTheCode.setBounds(40, 210, 200, 80);
        mobileNoField.setBounds(140, 70, 150, 30);
        passwordField.setBounds(140, 110, 150, 30);
        codeText.setBounds(140, 150, 200, 80);
        codeField.setBounds(140, 240, 170, 30);
        loginButton.setBounds(135, 285, 140, 30);
        cancelButton.setBounds(300, 285, 140, 30);
        signupButton.setBounds(180, 320, 170, 30);
        recoverPassword.setBounds(350, 320, 200, 30);

        loginButton.setBackground(Color.ORANGE);
        cancelButton.setBackground(Color.ORANGE);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                if (username.equals("Asif") && password.equals("1234") && mobileNo.equals("0300 1556660")) {
                    JOptionPane.showMessageDialog(null, "Logged-in successful");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username/password");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //  panel5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        passwordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = String.valueOf(passwordField.getPassword());
                setPasswordStrengthLabel(password);
            }
        });

        panel.add(login);
        panel.add(mobileNo);
        panel.add(password);
        panel.add(mobileNoField);
        panel.add(passwordField);
        panel.add(codeText);
        panel.add(codeField);
        panel.add(enterTheCode);
        panel.add(loginButton);
        panel.add(cancelButton);
        panel.add(signupButton);
        panel.add(recoverPassword);
        panel.add(username);
        panel.add(usernameField);

        panel.setBackground(Color.decode("#254252"));
        panel.setLayout(null);

        frame.setSize(800, 709);
        frame.add(panel);
        frame.setVisible(true);
        panel.setLayout(null);
        frame.setLocationRelativeTo(null);
    }
//Checking password is strong or not
    private void setPasswordStrengthLabel(String password) {
        if (isStrongPassword(password)) {
            passwordStrengthLabel.setText("Strong");
            passwordStrengthLabel.setForeground(Color.GREEN);
        } else {
            passwordStrengthLabel.setText("Weak");
            passwordStrengthLabel.setForeground(Color.RED);
        }
    }

    private boolean isStrongPassword(String password) {
       if(password.length()<8){
           System.out.println("Enter strong Password");
       }
        return password.length() >= 8 || password.matches(".*[!@#$%^&*()].*");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Book_ur_ticket();
            }
        });
    }
}
