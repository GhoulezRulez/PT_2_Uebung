package TierischeGerauesche;

import TierischeGerauesche.Hahn;
import TierischeGerauesche.Hund;
import TierischeGerauesche.Kuh;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animal Sound Test");

    Hund h = new Hund();
    Schaf s = new Schaf();
    Hahn g = new Hahn();
    Kuh k = new Kuh();
    // Haustier i = new Haustier(); <-- funktioniert nicht wenn die Klasse Hausstier abstract ist
    h.gerauescheMachen();
    s.gerauescheMachen();
    g.gerauescheMachen();
    k.gerauescheMachen();
    
    }
}