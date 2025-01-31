import java.util.Random;

/**
 * Created by Andra on 24.02.2015.
 */
public class Dalek2 {

    private String[] s = {};
    Random r=new Random();

    public void setSayings(String[] s) {
        this.s=s;
    }

    public void speak() {
        if (s.length>0)
            System.out.println(s[r.nextInt(s.length)]);
        if (s.length==0){
            System.out.println("No utterances installed");
        }
    }


    public static void main(String[] args) {

        Dalek2 d1 = new Dalek2();
        String[] u1 = { "Exterminate, Exterminate!", "I obey!",
                "Exterminate, annihilate, DESTROY!", "You cannot escape.",
                "Daleks do not feel fear.", "The Daleks must survive!" };
        d1.setSayings(u1);

        System.out.println("\nDalek d1 says: ");
        for (int i = 0; i < 10; i++) {
            d1.speak();
        }

        System.out.println("\nDalek d2 says: ");
        Dalek2 d2 = new Dalek2();
        String[] u2 = { "I obey!" };
        d2.setSayings(u2);

        for (int i = 0; i < 10; i++) {
            d2.speak();
        }

    }
}
