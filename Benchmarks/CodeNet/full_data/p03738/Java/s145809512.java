import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int NA = A.length();
        int NB = B.length();

        if (NA > NB) {
            System.out.println("GREATER");
        } else if (NA < NB) {
            System.out.println("LESS");
        } else {
            int ret = A.compareTo(B);
            if (ret > 0) {
                System.out.println("GREATER");
            } else if (ret < 0) {
                System.out.println("LESS");
            } else {
                System.out.println("EQUAL");
            }

        }


        return;
    }

}