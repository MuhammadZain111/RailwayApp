package Project_for_Finals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class publicNotice {

    public publicNotice() {

        JFrame frame = new JFrame("JTextArea Example");

        JPanel panel0 = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        panel0.setBounds(0, 0, 800, 800);
        panel1.setBounds(30, 30, 310, 300);
        panel2.setBounds(420, 30, 310, 300);
        panel3.setBounds(20, 450, 310, 300);
        panel4.setBounds(400, 450, 310, 300);

        panel1.setSize(300, 300);
        panel2.setSize(300, 300);
        panel3.setSize(300, 300);
        panel4.setSize(300, 300);

        panel0.setBackground(Color.decode("#171C2D"));
        panel1.setBackground(Color.decode("#254252"));
        panel2.setBackground(Color.decode("#254252"));
        panel3.setBackground(Color.decode("#254252"));
        panel4.setBackground(Color.decode("#254252"));

        // Create a JTextArea
        JTextArea textArea = new JTextArea("----------------------------------------------\n" +
                "Attention all residents:\n" +
                "Please be advised that there will be a scheduled power outage on Saturday, June 5th, from 9:00 AM to 1:00 PM. We apologize for any inconvenience caused and appreciate your understanding. If you have any questions or require further information, please contact our customer service hotline. Thank you \n.", 10, 40);

        JTextArea textArea1 = new JTextArea("Attention all passengers:\n" +
                "We are pleased to inform you that effective immediately, the train schedule has been revised to better serve our passengers. The updated timetable includes additional departures during peak hours and improved connectivity between major destinations. We strive to provide a seamless and efficient commuting experience for everyone.\n" +
                "\n" +
                "Please note that face masks remain mandatory for all passengers and adherence to social distancing guidelines is greatly appreciated. Our dedicated staff is committed to maintaining a clean and safe environment throughout your journey.\n" +
                "\n" +
                "We thank you for your continued support and cooperation. For any inquiries or assistance, please contact our customer service desk or visit our website. Travel with us and enjoy a comfortable and reliable railway experience!Thank you for your patience and cooperation.\n" +
                "\n" +
                "Railway Management");

        JTextArea textArea2 = new JTextArea("Due to essential maintenance work, there will be a temporary disruption of railway services on [Date]. We apologize for the inconvenience caused and appreciate your understanding.\n" +
                "\n" +
                "Alternative transportation arrangements have been made to assist you during this period. Please refer to our website or contact our customer service for more information.Thank you for your patience and cooperation.\n" +
                "\n" +
                "Railway Management");

        JTextArea textArea3 = new JTextArea("Attention Passengers:\n" +
                "\n" +
                "We are pleased to announce that our train services are now operating with improved schedules and increased frequency. Enjoy a seamless and reliable commuting experience with us.");

        // JTextArea
        textArea.setFont(new Font("Roboto", Font.ITALIC, 17));
        textArea1.setFont(new Font("Roboto", Font.ITALIC, 17));
        textArea2.setFont(new Font("Roboto", Font.ITALIC, 17));
        textArea3.setFont(new Font("Roboto", Font.ITALIC, 17));

        textArea.setBounds(10, 20, 300, 300);
        textArea1.setBounds(10, 20, 300, 300);
        textArea2.setBounds(10, 20, 300, 300);
        textArea3.setBounds(10, 20, 300, 300);

        textArea.setLineWrap(true);
        textArea1.setLineWrap(true);
        textArea2.setLineWrap(true);
        textArea2.setLineWrap(true);

        textArea.setWrapStyleWord(true);
        textArea1.setWrapStyleWord(true);
        textArea2.setWrapStyleWord(true);
        textArea3.setWrapStyleWord(true);

        textArea.setForeground(Color.WHITE);
        textArea1.setForeground(Color.WHITE);
        textArea2.setForeground(Color.WHITE);
        textArea3.setForeground(Color.WHITE);

        textArea.setOpaque(false);
        textArea1.setOpaque(false);
        textArea2.setOpaque(false);
        textArea3.setOpaque(false);

        textArea.setEditable(false);
        textArea1.setEditable(false);
        textArea2.setEditable(false);
        textArea3.setEditable(false);

        textArea.setBackground(new Color(0, 0, 0, 0));

        panel1.add(textArea);
        panel2.add(textArea1);
        panel3.add(textArea2);
        panel4.add(textArea3);

        panel0.setLayout(null);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);

        frame.add(panel0);
        panel0.add(panel1);
        panel0.add(panel2);
        panel0.add(panel3);
        panel0.add(panel4);

        panel1.setVisible(true);
        panel2.setVisible(true);
        panel3.setVisible(true);
        panel4.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new publicNotice();
    }
}
