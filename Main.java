package Project_for_Finals;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Main {
    Main() {

//-->frames and panels

        JFrame frame = new JFrame("PAK RAILWAY");
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JLabel logoLabel = new JLabel();
        JLabel profileImageLabel = new JLabel();
        JLabel welcome = new JLabel("Welcome Aboard");

//-->Create buttons

        JButton homebutton = new JButton("Home");
        JButton traintimingbutton = new JButton("Train Timing");
        JButton tendersbutton = new JButton("Tenders");
        JButton publicnoticesbutton = new JButton("Public Notices");
        JButton gallerybutton = new JButton("Check Fair");
        JButton careerbutton = new JButton("Career");
        JButton genralinfobutton = new JButton("General Info");
        JButton Signupbutton = new JButton("Sign In");
        JButton book_your_train_tickets_button = new JButton("Book Your train Tickets");
        JButton complaintbutton = new JButton("LODGE A COMPLAINT");
        JButton bidforpremium = new JButton("Bid For PREMIUM TRAIN");
        JButton planyourjourney = new JButton("PLAN YOUR JOUNEY");
        JButton Routesbutton = new JButton("Junction Routes");
        JButton bookCalendarButton = new JButton("Book Your Calendar");

        JTextField selectedDateField = new JTextField();


        // selectedDateField.setEditable(false);


        //-->Adding images

        ImageIcon icon = new ImageIcon(Main.class.getResource("flag.jpg"));
        frame.setIconImage(icon.getImage());


        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(900, 400));


        //profileImageLabel.setBounds(0, 0, 800, 430);

//        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Muhammad Asif\\Downloads\\jojo.jpg");
//        profileImageLabel.setIcon(imageIcon);

        //-->LOGO

        ImageIcon logoimage = new ImageIcon("C:\\Users\\Muhammad Asif\\Downloads\\ndd.jpg");
        JLabel imagelabel = new JLabel(logoimage);

        Image img = logoimage.getImage();
        // Image resizedImg = img.getScaledInstance(2000, 800, Image.SCALE_SMOOTH);
        imagelabel.setBounds(5, 5, 180, 140);

        panel2.add(imagelabel);


        homebutton.setBounds(140, 150, 100, 40);
        traintimingbutton.setBounds(240, 150, 130, 40);
        tendersbutton.setBounds(360, 150, 120, 40);
        publicnoticesbutton.setBounds(460, 150, 150, 40);
        gallerybutton.setBounds(600, 150, 110, 40);
        careerbutton.setBounds(700, 150, 120, 40);
        genralinfobutton.setBounds(820, 150, 130, 40);
        Routesbutton.setBounds(950, 150, 130, 40);
        Signupbutton.setBounds(1070, 80, 110, 40);
        book_your_train_tickets_button.setBounds(980, 200, 200, 40);


        complaintbutton.setBounds(50, 50, 200, 50);
        bidforpremium.setBounds(50, 100, 200, 50);
        planyourjourney.setBounds(50, 150, 200, 50);
        bookCalendarButton.setBounds(50, 200, 200, 50);


        logoLabel.setBounds(20, 20, 120, 110);


        panel.setBounds(0, 0, 150, 800);


        panel2.setBounds(80, 70, 1350, 700);

        panel3.setBounds(50, 150, 1130, 40);

        panel4.setBounds(50, 260, 300, 300);

        panel5.setBounds(380, 260, 800, 430);


        panel5.add(profileImageLabel);

        homebutton.setBackground(Color.decode("#A1B5C1"));
        traintimingbutton.setBackground(Color.decode("#A1B5C1"));
        tendersbutton.setBackground(Color.decode("#A1B5C1"));
        publicnoticesbutton.setBackground(Color.decode("#A1B5C1"));
        gallerybutton.setBackground(Color.decode("#A1B5C1"));
        careerbutton.setBackground(Color.decode("#A1B5C1"));
        genralinfobutton.setBackground(Color.decode("#A1B5C1"));
        Signupbutton.setBackground(Color.decode("#A1B5C1"));
        book_your_train_tickets_button.setBackground(Color.decode("#A1B5C1"));
        Routesbutton.setBackground(Color.decode("#A1B5C1"));
        complaintbutton.setBackground(Color.decode("#A1B5C1"));
        bidforpremium.setBackground(Color.decode("#A1B5C1"));
        planyourjourney.setBackground(Color.decode("#A1B5C1"));
        bookCalendarButton.setBackground(Color.decode("#A1B5C1"));


        panel.setBackground(Color.decode("#171C2D"));


        panel2.setBackground(Color.decode("#254252"));


        panel3.setBackground(Color.decode("#171C2D"));


        panel4.setBackground(Color.decode("#171C2D"));

        // panel6.add(profileImageLabel);

        //panel5.setBackground(Color.);


        welcome.setForeground(Color.decode("#171C2D"));
        welcome.setFont(new Font("Edwardian Script ITC", Font.BOLD, 75));


        welcome.setBounds(140, 200, 450, 70);

        panel5.setLayout(null);


        panel5.add(welcome);

        panel5.setBackground(Color.orange);


        //panel2.add(homebutton);


        panel2.add(homebutton);
        panel2.add(traintimingbutton);
        panel2.add(tendersbutton);
        panel2.add(publicnoticesbutton);
        panel2.add(gallerybutton);
        panel2.add(careerbutton);
        panel2.add(genralinfobutton);
        panel2.add(Routesbutton);
        panel2.add(Signupbutton);
        panel2.add(logoLabel);
        panel2.add(book_your_train_tickets_button);
        panel4.add(complaintbutton);
        panel4.add(bidforpremium);
        panel4.add(planyourjourney);
        panel4.add(bookCalendarButton);
        panel4.add(selectedDateField);


        panel.add(panel2);

        panel2.add(panel3);
        panel2.add(panel4);
        panel2.add(panel5);
        panel2.add(panel6);

        //   panel.add(backgroundLabel);

        panel.setLayout(null);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel4.setLayout(null);
        panel4.setLayout(null);
        panel6.setLayout(null);

        frame.add(panel);
        frame.setSize(1550, 950);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);


        Signupbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Signupclass();
            }

        });


        panel2.add(panel5);
        panel5.setLayout(null);

        book_your_train_tickets_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel greetlabel = new JLabel("WELCOME TO PAKISTAN PASSENGER PORTAL");
                JButton bookTicket = new JButton("BOOK E-Ticket");
                JButton helpline = new JButton("HELPLINE");
                JButton instruction = new JButton("INSTRUCTIONS");
                JButton trainsInfo = new JButton("TRAIN INFO");

                greetlabel.setFont(new Font("Castellar", Font.BOLD, 26));
                greetlabel.setForeground(Color.decode("#171C2D"));

                panel6.setBounds(380, 260, 800, 430);
                greetlabel.setBounds(20, 40, 700, 20);
                bookTicket.setBounds(100, 80, 200, 60);
                helpline.setBounds(100, 140, 200, 60);
                instruction.setBounds(320, 80, 200, 60);
                trainsInfo.setBounds(320, 140, 200, 60);

                bookTicket.setBackground(Color.decode("#171C2D"));
                helpline.setBackground(Color.decode("#171C2D"));
                instruction.setBackground(Color.decode("#171C2D"));
                trainsInfo.setBackground(Color.decode("#171C2D"));

                bookTicket.setForeground(Color.WHITE);
                helpline.setForeground(Color.WHITE);
                instruction.setForeground(Color.WHITE);
                trainsInfo.setForeground(Color.WHITE);

                panel5.setVisible(false);
                panel2.add(panel6);


                panel6.setBackground(Color.ORANGE);
                panel6.add(greetlabel);
                panel6.add(bookTicket);
                panel6.add(helpline);
                panel6.add(instruction);
                panel6.add(trainsInfo);

                bookTicket.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new PdfGenerator();
                    }
                });
                trainsInfo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new trainTiming();
                    }
                });
                helpline.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String helplineText = "Train Helpline Information:\n\n";
                        helplineText += "General Enquiries: 123456789\n";
                        helplineText += "Ticket Reservations: 987654321\n";
                        helplineText += "Lost and Found: 456789123\n";


                        JTextArea helplineTextArea = new JTextArea(helplineText);
                        helplineTextArea.setEditable(false);
                        JScrollPane scrollPane = new JScrollPane(helplineTextArea);
                        scrollPane.setPreferredSize(new Dimension(300, 200));

                        JOptionPane.showMessageDialog(null, scrollPane, "Train Helpline", JOptionPane.INFORMATION_MESSAGE);
                    }
                });
                instruction.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String instructionsText = "Instructions:\n\n";
                        instructionsText += "1. Select your desired train from the list.\n";
                        instructionsText += "2. Choose your journey date.\n";
                        instructionsText += "3. Enter passenger details.\n";
                        instructionsText += "4. Review your booking information.\n";
                        instructionsText += "5. Make the payment.\n";
                        instructionsText += "6. Receive your e-ticket via email.\n";
                        // Add more instructions as needed

                        JTextArea instructionsTextArea = new JTextArea(instructionsText);
                        instructionsTextArea.setEditable(false);
                        JScrollPane scrollPane = new JScrollPane(instructionsTextArea);
                        scrollPane.setPreferredSize(new Dimension(300, 200));

                        JOptionPane.showMessageDialog(null, scrollPane, "Instructions", JOptionPane.INFORMATION_MESSAGE);
                    }
                });

                panel5.setLayout(null);
            }
        });
//        publicnoticesbutton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                new publicNotice();
//            }
//        });
        // traintimingbutton.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         new trainTiming();
        //     }
        // });
        homebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Main();
            }
        });
        tendersbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to retrieve and display tenders
                String[] tenders = {"SUPPLY OF MEDICINES", "EXCLUSIVE SELLING RIGHTS FOR THREE (03) YEARS", "MAINTENANCE OF AC & ECONOMY CLASS COACHES"};
                String tenderText = "";
                for (String tender : tenders) {
                    tenderText += tender + "\n";
                }
                JOptionPane.showMessageDialog(null, tenderText, "Tenders", JOptionPane.INFORMATION_MESSAGE);

            }
        });
        publicnoticesbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] notices = {
                        "Notice 1: Train schedule changes on June 10th.",
                        "Notice 2: Maintenance work on Business train route.",
                        "Notice 3: Delays expected due to weather conditions.",
                        // Add more notices as needed
                };


                Random random = new Random();
                String randomNotice = notices[random.nextInt(notices.length)];

                JOptionPane.showMessageDialog(null, randomNotice, "Public Notice", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        complaintbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String complaint = JOptionPane.showInputDialog(frame, "Please enter your complaint:", "Lodge a Complaint", JOptionPane.PLAIN_MESSAGE);
                if (complaint != null && !complaint.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Complaint submitted. Thank you for your feedback!", "Complaint Submitted", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "No complaint entered. Please provide your feedback.", "Invalid Complaint", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        final double[] currentBidAmount = {0.0};
        bidforpremium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bidString = JOptionPane.showInputDialog(frame, "Enter your bid amount:");
                if (bidString != null && !bidString.isEmpty()) {
                    try {
                        double bidAmount = Double.parseDouble(bidString);
                        if (bidAmount > currentBidAmount[0]) {
                            currentBidAmount[0] = bidAmount;
                            JOptionPane.showMessageDialog(frame, "Bid placed successfully. Current highest bid: " + currentBidAmount[0], "Bid Placed", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(frame, "Your bid amount must be higher than the current highest bid: " + currentBidAmount[0], "Invalid Bid Amount", JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid bid amount. Please enter a valid number.", "Invalid Bid Amount", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });
        planyourjourney.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a dialog box to get journey details from the user
                JTextField sourceField = new JTextField();
                JTextField destinationField = new JTextField();
                JTextField dateField = new JTextField();

                JPanel journeyPanel = new JPanel();
                journeyPanel.setLayout(new GridLayout(3, 2));
                journeyPanel.add(new JLabel("Source:"));
                journeyPanel.add(sourceField);
                journeyPanel.add(new JLabel("Destination:"));
                journeyPanel.add(destinationField);
                journeyPanel.add(new JLabel("Date (YYYY-MM-DD):"));
                journeyPanel.add(dateField);

                int result = JOptionPane.showConfirmDialog(frame, journeyPanel, "Plan Your Journey", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    String source = sourceField.getText();
                    String destination = destinationField.getText();
                    String date = dateField.getText();

                    if (source.isEmpty() || destination.isEmpty() || date.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Please enter all journey details.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    } else {
                        String journeyResult = "Your journey from " + source + " to " + destination + " on " + date + " has been planned.";
                        JOptionPane.showMessageDialog(frame, journeyResult, "Journey Planned", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            }
        });
        genralinfobutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String generalInfo = "General Information:\n\n";
                generalInfo += "- Pakistan Railway is the national railway company of Pakistan.\n";
                generalInfo += "- Pakistan Railway is known for its extensive network and scenic routes.\n";
                generalInfo += "- The railway system offers various classes of travel, including AC, Economy, and Business.\n";
                generalInfo += "- Passengers can book tickets online or through railway booking offices.\n";
                generalInfo += "- For any complaints or feedback, passengers can lodge a complaint through the provided form.\n";
                generalInfo += "- Public notices are issued to inform passengers about schedule changes, maintenance work, and other important updates.\n";
                generalInfo += "- Passengers can bid for premium train services by entering their bid amount.\n";
                generalInfo += "- The journey planning feature allows users to plan their train travel by specifying the source, destination, and date.\n";
                generalInfo += "- The system also provides options to view train timings, book e-tickets, and access a gallery of train images.\n";
                generalInfo += "- Users can sign in to access additional features and personalized services.\n";

                JTextArea generalInfoTextArea = new JTextArea(generalInfo);
                generalInfoTextArea.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(generalInfoTextArea);
                scrollPane.setPreferredSize(new Dimension(300, 200));

                JOptionPane.showMessageDialog(null, scrollPane, "General Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        Routesbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Display junction routes here", "Junction Routes", JOptionPane.INFORMATION_MESSAGE);
            }
        });
   Routesbutton.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           String[] cities = {"Karachi", "Peshawar"};

           // Prompting the user to select a city
           String selectedCity = (String) JOptionPane.showInputDialog(null, "Select a city:",
                   "City Selection", JOptionPane.PLAIN_MESSAGE, null, cities, cities[0]);

           if (selectedCity != null) {
               String[] junctionRoutes;

               // Determine junction routes based on the selected city
               if (selectedCity.equals("Karachi")) {
                   junctionRoutes = new String[]{" Golra Sharif Junction", "Sukkur Junction", "Kohat Tehsil Junction", "Havelian Junction", "Nowshera Junction"};
               } else if (selectedCity.equals("Peshawar")) {
                   junctionRoutes = new String[]{"Lala Musa Junction", "Rawalpindi Junction", "Lahore Junction", "Islamabad Junction", "Bahawalpur Junction", "Peshawar Junction"};
               } else {
                   // Handle other cities or invalid input
                   junctionRoutes = new String[0];
               }

               // Creating the information dialog box
               JOptionPane.showMessageDialog(null, "Available Junction Routes in " + selectedCity + ":\n\n"
                       + String.join("\n", junctionRoutes), "Junction Routes", JOptionPane.INFORMATION_MESSAGE);
           }
       }



   });
        careerbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String instructionsText = "career Opportunity!:\n\n";
                instructionsText += "1.Travel: Working aboard a train can allow you to travel to different areas for work.\n";
                instructionsText += "2. Benefits: In addition to competitive pay, rail transportation employees can also receive desirable health, 401(k) and vacation benefits.\n";
                instructionsText += "3. Engineers in railways can specialize in civil, electrical, mechanical, or signaling systems.\n";
                instructionsText += "4. Railway operations roles ensure safe, efficient, and punctual train services\n";

                // Add more instructions as needed

                JTextArea instructionsTextArea = new JTextArea(instructionsText);
                instructionsTextArea.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(instructionsTextArea);
                scrollPane.setPreferredSize(new Dimension(300, 200));

                JOptionPane.showMessageDialog(null, scrollPane, "Career Opportunity!", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        gallerybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String instructionsText = "Economy Class::\n\n";
                instructionsText += "1.Short distance: 200 PKR\n";
                instructionsText += "2. Medium distance: 500 PKR\n";
                instructionsText += "3.Long distance: 1000 PKR\n";


                JTextArea instructionsTextArea = new JTextArea(instructionsText);
                instructionsTextArea.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(instructionsTextArea);
                scrollPane.setPreferredSize(new Dimension(300, 200));

                JOptionPane.showMessageDialog(null, scrollPane, "Estimated Fairs ", JOptionPane.INFORMATION_MESSAGE);
            }
        });



             // Array of available cities



    }


    public static void main(String[] args){
        new Main();
    }
}
