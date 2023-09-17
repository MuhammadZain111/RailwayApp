package Project_for_Finals;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class PdfGenerator {

    private JLabel priceLabel;
    private JComboBox<String> cityComboBox;
    private JComboBox<String> cityComboBox2;

    private JComboBox<String> seatsCombobox;
    public PdfGenerator() {
        JFrame frame5 = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        JLabel name = new JLabel("Name:* ");
        JLabel phone = new JLabel("Phone no:* ");
        JLabel cnic = new JLabel("CNIC:* ");
        JButton generateTicket= new JButton("Generate Ticket");

        JTextField nameField = new JTextField();
        JTextField phoneField = new JTextField();
        JTextField cnicField = new JTextField();
        JLabel price = new JLabel("Price");
        priceLabel = new JLabel();

        JRadioButton Male = new JRadioButton("Male");
        JRadioButton Female = new JRadioButton("Female");
        JButton fairButton = new JButton("Calculate Fair");
        JLabel genderLabel =new JLabel("What is your gender? ");
        JLabel confirmLabel=new JLabel("Are you sure?");

        JLabel departureDate = new JLabel("Select Date");
        JLabel departureLabel=new JLabel("Select Departure");
        JLabel destinationLabel=new JLabel("Select Arrival");
        JCheckBox checkBox = new JCheckBox();




        String[] cities = {"From Station", "Lahore", "Sahiwal", "Karachi", "Islamabad", "Rawalpindi", "Multan", "Okara"};
        cityComboBox = new JComboBox<>(cities);

        String[] cities2 = {"To Station", "Lahore", "Sahiwal", "Multan", "Islamabad", "Rawalpindi", "Multan", "Okara"};
        cityComboBox2 = new JComboBox<>(cities2);

        String[] seats = {"1", "2", "3", "4", "5", "6", "7", "8"};
        seatsCombobox = new JComboBox<>(seats);



        JComboBox<Integer> dateComboBox = new JComboBox<>();
        for (int i = 1; i <= 31; i++) {
            dateComboBox.addItem(i);
        }

        panel.setBackground(Color.decode("#171C2D"));


        name.setForeground(Color.WHITE);
        phone.setForeground(Color.WHITE);
        cnic.setForeground(Color.WHITE);
        departureLabel.setForeground(Color.WHITE);
        departureDate.setForeground(Color.WHITE);
        destinationLabel.setForeground(Color.WHITE);
        priceLabel.setForeground(Color.WHITE);
        price.setForeground(Color.WHITE);
        genderLabel.setForeground(Color.WHITE);
        confirmLabel.setForeground(Color.WHITE);


        name.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        phone.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        cnic.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        price.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        departureDate.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 15));
        departureLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        destinationLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        priceLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 22));
        genderLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
        confirmLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));

        fairButton.setBackground(Color.decode("#A1B5C1"));

        name.setBounds(80, 100, 100, 40);

        phone.setBounds(80, 140, 100, 40);
        cnic.setBounds(80, 180, 100, 40);

        nameField.setBounds(200, 110, 200, 30);
        phoneField.setBounds(200, 150, 200, 30);
        cnicField.setBounds(200, 190, 200, 30);

        departureDate.setBounds(80,230,200,30);
        dateComboBox.setBounds(200,230,60,30);

        departureLabel.setBounds(120, 280, 200, 35);
        destinationLabel.setBounds(400, 280, 200, 35);

        cityComboBox.setBounds(90, 310, 200, 35);
        cityComboBox2.setBounds(350, 310, 200, 35);

        fairButton.setBounds(200 , 370, 130, 40);

        price.setBounds(400, 400, 100, 30);
        priceLabel.setBounds(450, 400, 100, 30);

        //  price.setFont(new Font("Roboto", Font.ITALIC, 18));



        genderLabel.setBounds(50,435,400,50);
        Male.setBounds(210, 450, 80, 20);
        Female.setBounds(350, 450, 80, 20);

        confirmLabel.setBounds(200,480,300 ,50);

        checkBox.setBounds(210,520,10,10);

        generateTicket.setBounds(300, 550, 200, 30);





        String train="Allama iqabal Express";



        fairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePrice();
            }
        });


        generateTicket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateTicketPDF(nameField.getText(), phoneField.getText(), cnicField.getText(),priceLabel.getText(),train);
            }
        });

        panel2.add(departureDate);
        panel2.add(name);
        panel2.add(nameField);
        panel2.add(phone);
        panel2.add(phoneField);
        panel2.add(cityComboBox);
        panel2.add(cityComboBox2);
        panel2.add(cnic);
        panel2.add(cnicField);
        panel2.add(price);
        panel2.add(priceLabel);
        panel2.add(fairButton);
        panel2.add(seatsCombobox);
        panel2.add(genderLabel);
        panel2.add(Male);
        panel2.add(Female);
        panel2.add(departureLabel);
        panel2.add(destinationLabel);
        panel2.add(checkBox);

        panel.add(panel2);
        panel2.setBounds(60,40,650,680);
        panel2.setBackground(Color.decode("#254252"));

panel.setVisible(true);
panel2.setVisible(true);
panel.setLayout(null);


        panel2.add(dateComboBox);

        panel2.add(confirmLabel);

        panel2.add(generateTicket);

        panel2.setLayout(null);
        frame5.add(panel);
        frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame5.setSize(800, 800);
        frame5.setLocationRelativeTo(null);

        frame5.setVisible(true);

    }

    private void updatePrice() {
        int charges = 0;
        String selectedCity1 = cityComboBox.getSelectedItem().toString();
        String selectedCity2 = cityComboBox2.getSelectedItem().toString();
        int seat_no;

        if (selectedCity1.equals("Sahiwal") && selectedCity2.equals("Lahore") ||
                (selectedCity1.equals("Lahore") && selectedCity2.equals("Sahiwal"))) {
            charges = 700;
            seat_no=5;
            // train="Allama Iqbal Express";

        } else if ((selectedCity1.equals("Sahiwal") && selectedCity2.equals("Karachi")) ||
                (selectedCity1.equals("Karachi") && selectedCity2.equals("Sahiwal"))) {
            charges = 2500;
            seat_no=8;
            //  train="Jafar Express";
        } else if (selectedCity1.equals("Sahiwal") && selectedCity2.equals("Rawalpindi") ||
                (selectedCity1.equals("Rawalpindi") && selectedCity2.equals("Sahiwal"))) {
            charges = 1100;
            seat_no=10;
            // train="Karachi Express";
        } else if (selectedCity1.equals("Sahiwal") && selectedCity2.equals("Islamabad") ||
                (selectedCity1.equals("Islamabad") && selectedCity2.equals("Sahiwal"))) {
            charges = 2000;
            seat_no=20;
        } else if (selectedCity1.equals("Sahiwal") && selectedCity2.equals("Okara") ||
                (selectedCity1.equals("Okara") && selectedCity2.equals("Sahiwal"))) {
            charges = 300;
            seat_no=16;
        } else if (selectedCity1.equals("Sahiwal") && selectedCity2.equals("Hyderabad") ||
                (selectedCity1.equals("Hyderabad") && selectedCity2.equals("Sahiwal"))) {
            charges = 2100;
            seat_no=12;
        } else if (selectedCity1.equals("Lahore") && selectedCity2.equals("Karachi") ||
                (selectedCity1.equals("Karachi") && selectedCity2.equals("Lahore"))) {
            charges = 2100;
            seat_no=20;
        }
        else if (selectedCity1.equals("Sahiwal") && selectedCity2.equals("Multan") ||
                (selectedCity1.equals("Multan") && selectedCity2.equals("Sahiwal"))) {

            charges=700;
            seat_no=22;
        }
        else if (selectedCity1.equals("Lahore") && selectedCity2.equals("Multan") ||
                (selectedCity1.equals("Multan") && selectedCity2.equals("Lahore"))) {

            charges = 1500;
            seat_no = 23;
        }
        else if (selectedCity1.equals("Rawalpindi") && selectedCity2.equals("Islamabad") ||
                (selectedCity1.equals("Islamabad") && selectedCity2.equals("Rawalpindi"))) {

            charges = 1100;
            seat_no = 43;


        }

        priceLabel.setText(String.valueOf(charges));
    }


    private void generateTicketPDF(String name, String phone, String cnic,String charges,String train) {
        Document document = new Document();

        String fromCity1 = cityComboBox.getSelectedItem().toString();
        String toCity2 = cityComboBox2.getSelectedItem().toString();


        try {

            PdfWriter.getInstance(document, new FileOutputStream("Ticket.pdf"));
            document.open();

            var table = new PdfPTable(2);

            Font boldFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);

            //  java.awt.Font boldFont = new java.awt.Font(java.awt.Font.FontFamily.HELVETICA, 18, java.awt.Font.BOLD);

            Paragraph paragraph = new Paragraph("Ticket Details\n\n", boldFont);
            Paragraph greet=new Paragraph("Have a safe Journey\n\n",boldFont);
            Paragraph message=new Paragraph("Thanks for choosing any Sevices");
            Paragraph errmessage=new Paragraph("In case of any issue please contact 0300-1556660 ");
            paragraph.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(paragraph);

            table.addCell("Field");
            table.addCell("Value");

            table.addCell("Name");
            table.addCell(name);

            table.addCell("Phone");
            table.addCell(phone);

            table.addCell("CNIC");
            table.addCell(cnic);

            table.addCell("From");
            table.addCell(fromCity1);

            table.addCell("To");
            table.addCell(toCity2);

            table.addCell("Fare Charges");
            table.addCell(charges);

            table.addCell("Train");
            table.addCell(train);

            document.add(table);


            paragraph.add(table);
            document.add(greet);
            document.add(message);
            document.add(errmessage);


            document.close();
            JOptionPane.showMessageDialog(null, "Ticket generated successfully!");
        } catch (DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error occurred while generating ticket: " + e.getMessage());


        }
    }





    public static void main(String[] args) {
        new PdfGenerator();

}
}
