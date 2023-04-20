package Uebung2;

import Uebung2.PruefungsPanikException;

public class TurboLernenFuerPruefungen {

    public void lernen(boolean nochGenugZeit) throws PruefungsPanikException {
        if (nochGenugZeit == true) {
            System.out.println("Großartiges Zeitmanagement. Weiter so!");


        } else {
            throw new PruefungsPanikException("In der Ruhe liegt die Kraft.");
        }

    }
}
