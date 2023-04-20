package Uebung2;

public class Main {
    public static void main(String[] args) {
        TurboLernenFuerPruefungen tl = new TurboLernenFuerPruefungen();
        System.out.println("Ohne Exception: ");
        try {
            tl.lernen(true);
        } catch (PruefungsPanikException e) {
            e.getMessage();

        }
        System.out.println("MIT Exception:");
        try {

            tl.lernen(false);
        } catch (PruefungsPanikException e) {
            System.out.println("Alles kein Problem");
            System.out.println(e.getMessage());
        }
    }
}
