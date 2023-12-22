import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();

            int count = 0;
            for (int l = 0, r = S.length() - 1; l < r; l++, r--) {
                if (S.charAt(l) != S.charAt(r)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
