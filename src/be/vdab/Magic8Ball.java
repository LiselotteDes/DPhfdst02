package be.vdab;

import java.util.Random;

public enum Magic8Ball {
    INSTANCE;
    private final String[] antwoorden = {"Zoals ik het zie, ja.", "Het is zeker.", "Hoogst waarschijnlijk", "Ziet er goed uit.",
        "Zonder twijfel.", "Ja.", "Zeker", "Je mag er op rekenen.", "Vraag dit later nog eens", "Dit wil je niet weten.",
        "Ik kan dit nu niet voorspellen", "Concentreer je en stel je vraag opnieuw", "Je moet er niet op rekenen", "Nee.", "Ziet er niet goed uit",
        "Zeer twijfelachtig"};
    // Initialisatie op -1 (geen bestaande index) zorgt ervoor dat als het eerste random getal 0 is, dit het antwoord op index 0 kan geven
    private int laatsteAntwoordIndex = -1;
    public String geefAntwoord(String vraag) {
        System.out.println("Vraag: " + vraag);
        Random random = new Random();
        int randomGetal = random.nextInt(antwoorden.length);
        while (randomGetal == laatsteAntwoordIndex) {
            randomGetal = random.nextInt(antwoorden.length);
        }
        laatsteAntwoordIndex = randomGetal;
        return "Antwoord: " + antwoorden[randomGetal];
    }
}
