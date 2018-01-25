package be.vdab;
/*
Creational Design Pattern: *** SINGLETON ***
Voorbeeld: In de 'software van een auto' heb je maar 1 object van het type motor.
Oplossing: Beschrijf het object niet als een class, maar als een enum met één waarde.
- Deze ene waarde stelt het object voor dat maar één keer voorkomt in de werkelijkheid.
- De enum kan variabelen en methods bevatten die bij dit ene object horen.
  => Er kan maar één object bestaan in je code. (Vw 1)
  => Dit ene object is overal in je code gemakkelijk aanspreekbaar. (Vw 2)
*/
public enum Motor {
    // Deze enige waarde in de enum stelt het enige object voor.
    // (want: enumwaarden of constanten zijn 'instanties' van het enumtype waarbij ze horen)
    INSTANCE;
    private boolean gestart;
    public void start() {
        gestart = true;
        System.out.println("gestart");
    }
    public void stop() {
        gestart = false;
        System.out.println("gestopt");
    }
}
