import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        try (Scanner sc = new Scanner(System.in);) {
            // shirai_r
            
            String a = sc.next();
            String[] b = a.split("");

            String aUpper = a.toUpperCase();
            String[] c = aUpper.split("");

            boolean flag = false;

            int countC = 0;
            for (String st : b) {
                if (st.equals("C")) {
                    countC++;
                }
            }

            int countUpper = 0;
            for (int i = 0; i < c.length; i++) {
                if (b[i].equals(c[i])) {
                    countUpper++;
                }
            }

            boolean cc = false;
            for (int i = 2; i < c.length-1; i++) {
                if (b[i].equals("C")) {
                    cc = true;
                }
            }


            if (b[0].equals("A")) {
                if (cc) {
                    if (countC == 1) {
                        if (countUpper == 2) {
                            flag = true;
                        }
                    }
                }
            }
            System.out.println(flag ? "AC" : "WA");
        }

    }

}
