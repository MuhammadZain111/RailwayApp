package Project_for_Finals;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trainTiming {

    public trainTiming() {
        JFrame frame = new JFrame("JTable");
        JPanel panel = new JPanel();

        String[] columnNames = {"Days", "Train", "Karachi", "Lahore", "Sahiwal", "Islamabad"};

        Object[][] data = {
                {"Monday", "Allama Iqbal Express", "4:00 PM", "7:00 PM", "9:00 PM", "11:00 PM"},
                {"Tuesday", "Karachi Express", "5:00", "6:00", "5:0", "10:00"},
                {"Wednesday", "Awami Express", "9:00", "12:00", "3:00", "8:00"},
                {"Thursday", "Bahadur Express", "4:01", "11:00", "3:00", "8:00"},
                {"Friday","Business Express","1:00","4:00","7:00","10:00","2:00"},
                {"Saturday","Krakaram","4:00 ", "13:00", "9:00", "23:00"},
                {"Sunday","Bye Train","1:00","4:00","7:00","10:00","2:00"}


        };

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);
        table.setRowHeight(25);
        // Set the row height
        table.getTableHeader().setReorderingAllowed(false);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(400, 200));
        frame.add(scrollPane);

        panel = new JPanel(new BorderLayout());
        panel.add(table.getTableHeader(), BorderLayout.PAGE_START);
        panel.add(table, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setSize(830, 400);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new trainTiming();
            }
   });
    }
}
