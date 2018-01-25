package be.vdab;
public class VersnellingsbakMain {
    public static void main(String[] args) {
        try {
            Versnellingsbak.INSTANCE.hoger();
            Versnellingsbak.INSTANCE.lager();
            Versnellingsbak.INSTANCE.lager();
            Versnellingsbak.INSTANCE.lager();
        } catch(VerkeerdeVersnellingException ex) {
            System.out.println("verkeerde versnelling");
        }
    }
    
}
