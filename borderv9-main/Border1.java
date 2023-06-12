import javax.swing.*;
import java.awt.*;

public class Border1 {

    public Border1() { //Konstruktor
        JFrame myFrame = new JFrame(); // ein Neues Fentster wird erzeugt
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// es wird eingestellt, dass wenn man das Fenster
                                                                // schließt, das Programm automatisch stoppt
        myFrame.setSize(200, 200);                // Die Fenstergrösse wird eingestellt
        myFrame.setLocationRelativeTo(null);                   // Das Fenster wird mittig zentriert

        JButton myButton = new JButton ("Klick mich"); // Ein Button namens "myButton" wird erstellt mit der
                                                            // Beschriftung "Klick mich"
        myFrame.add(BorderLayout.EAST, myButton);           // Der Button wird zum Fenster eingefügt, welcher dann rechts
                                                            // im Fenster plaziert wird
        myFrame.setVisible(true);                           // Das Fenster wird sichtbar gemacht
    }

    public static void main(String[] args) {
        Border1 myBorderLayout1 = new Border1();} // Hier wird das Fenster instanziiert
}
