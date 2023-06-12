import javax.swing.*;
import java.awt.Container;
import javax.swing.JButton;


public class SwingingWindow {

    public static void main(String[] args){
        JFrame myFrame = new JFrame(); // erstellt ein Fenster
        myFrame.setVisible(true);       // macht es sichtbar
        myFrame.setSize(350,350); // stellt die Fenstergröße ein
        myFrame.setLocationRelativeTo(null); // sorgt dafür, dass es mittig ist
        Container myContentPane = myFrame.getContentPane(); // hier bekommt man den Content-Bereich
                                                            // und vergibt es in ein Container
        JButton myButtonClickMich = new JButton("Klick mich");//Button-Beschrifung wird erstellt
        myContentPane.add(myButtonClickMich);                      // Hier wird der Butten in den Bereich eingefügt

    }
}
