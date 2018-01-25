package be.vdab;
// Je gebruikt de motor als volgt:
public class Main {
    public static void main(String[] args) {
        Motor.INSTANCE.start();
        stopDeAuto();
    }
    public static void stopDeAuto() {
        /*
        Het object is makkelijk aanspreekbaar.
        Je moet het niet als parameter van de method stopDeAuto binnenkrijgen.
        Je moet het ook niet bijhouden in een private variabele.
        */
        Motor.INSTANCE.stop();
    }
}
