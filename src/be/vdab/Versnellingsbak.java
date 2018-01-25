package be.vdab;

public enum Versnellingsbak {
    INSTANCE;
    private int versnelling;
    public void hoger() {
        if(versnelling == 5) {
            throw new VerkeerdeVersnellingException();
        }
        versnelling++;
    }
    public void lager() {
        if(versnelling == -1) { // achteruit
            throw new VerkeerdeVersnellingException();
        }
        versnelling--;
    }
}
