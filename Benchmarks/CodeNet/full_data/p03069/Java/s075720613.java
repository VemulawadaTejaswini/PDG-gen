
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            String S = sc.next();
            boolean foundB = false;
            int bCount = 0;
            int wCount = 0;
            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);
                foundB = foundB || c == '#';
                if (foundB) {
                    if (c == '#') {
                        bCount += 1;
                    } else {
                        wCount += 1;
                    }
                }
            }
            System.out.println(Math.min(bCount, wCount));
        }
    }

}
