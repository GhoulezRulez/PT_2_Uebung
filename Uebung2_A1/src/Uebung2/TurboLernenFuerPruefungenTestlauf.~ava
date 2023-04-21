package Uebung2;

public class TurboLernenFuerPruefungenTestlauf {
    public static void main(String[] args) {
        TurboLernenFuerPruefungen tl = new TurboLernenFuerPruefungen();
        System.out.println("Ohne Exception: ");
        try {
            tl.lernen(true); //welche methode soll versucht werden
        } catch (PruefungsPanik e) { //welche exception könnte angenommen werden
            e.getMessage();

        }
        System.out.println("MIT Exception:");
        try {
            tl.lernen(false);
        } catch (PruefungsPanik e) {
            System.out.println("Alles kein Problem");
            System.out.println(e.getMessage());
        }
    }
}
