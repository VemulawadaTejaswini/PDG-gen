

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.next();
            boolean prevIsDream = false;
            boolean prevIsErase = false;

            while (!s.isEmpty()) {
                if (s.startsWith("erase")) {
                    s = s.substring(5);
                    prevIsErase = true;
                    prevIsDream = false;
                } else if (s.startsWith("dream")) {
                    s = s.substring(5);
                    prevIsErase = false;
                    prevIsDream = true;
                } else if (s.startsWith("er") && prevIsDream) {
                    s = s.substring(2);
                    prevIsErase = false;
                    prevIsDream = false;
                } else if (s.startsWith("r") && prevIsErase) {
                    s = s.substring(1);
                    prevIsErase = false;
                    prevIsDream = false;
                } else {
                    break;
                }
            }

            if (s.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
