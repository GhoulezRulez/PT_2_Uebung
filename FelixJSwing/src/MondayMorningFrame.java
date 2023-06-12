import javax.swing.*;   // hier sind alle notwendigen imports
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MondayMorningFrame { // Klasse MondayMorningFrame
    private JFrame frame = new JFrame(); //Neues Fenster wird erstellt
    private JButton hello_button = new JButton("Hey hey hey");//Button mit beschreibung
    private JButton goodbye_button = new JButton("Bye bye bye"); // Button mit beschreibung
    private JLabel west_label = new JLabel("Westen");//nur eine Beschreibung
    private JLabel center_label = new JLabel("Center"); // nur eine Beschreibung
    private JLabel east_label = new JLabel("Osten"); // nur eine Beschreibung

    public MondayMorningFrame(){ //Konstruktor vom Fenster
        frame.setVisible(true);

        frame.setTitle("Wunderschöner Montag Morgen");
        frame.setMinimumSize(new Dimension(500, 500));

        // Brauchen wir nicht explizit setzen, ist bereits Standard für JFrame
        //frame.setLayout(new BorderLayout());

        center_label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(BorderLayout.NORTH, hello_button); //hier wird button in Frame eingefügt
        frame.add(BorderLayout.SOUTH, goodbye_button); // hier wird button in Frame eingefügt

        frame.add(BorderLayout.WEST, west_label); //hier wird ein Label eingefügt
        frame.add(BorderLayout.CENTER, center_label);//hier wird ein Label eingefügt
        frame.add(BorderLayout.EAST, east_label);//hier wird ein Label eingefügt

        hello_button.addActionListener(e -> {  //wenn button geklickt wird, dann wird e generiert.
            center_label.setText("WWAAAAASUP!");// mit dieser Beschreibung
        });

        goodbye_button.addActionListener(e -> {      //wenn button geklickt wird, dann wird e generiert.
            center_label.setText("BIIIIIIITCONNNNNECT!");// mit dieser Beschreibung
        });

        // Das Ding ist eine Anonyme Klasse!
        goodbye_button.addActionListener(new ActionListener() { //hier ist ein ActionListner
            @Override
            public void actionPerformed(ActionEvent e) {
                center_label.setText("BIIIIIIITCONNNNNECT!");
            }
        });
    }
}