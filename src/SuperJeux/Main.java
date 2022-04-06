package SuperJeux;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Being> being= new ArrayList();

        being.add(new Dragon("TOTO", 20, 30, 60, 4 ));
        being.add(new Eagle("tutu", 10, 30, 100));
        being.add(new Wolf("tata", 5, 6, 100,50, 4));
        being.add(new Wolf("tata", 5, 6, 100,200, 4));

        for (Being b : being) {
            System.out.println((being));
        }

        Collections.sort(being);
        System.out.println("--------------");
        for (Being b : being) {
            System.out.println(b);
        }

    }
}

