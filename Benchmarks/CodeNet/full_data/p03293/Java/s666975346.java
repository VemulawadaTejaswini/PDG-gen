import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            String T = in.next();

            int n = S.length();
            for (int i = 0; i <= n; i++) {
                if (S.equals(T)) {
                    System.out.println("Yes");
                    return;
                }

                S = S.substring(n - 1, n) + S.substring(0, n - 1);
            }

            System.out.println("No");
        }
    }

}
