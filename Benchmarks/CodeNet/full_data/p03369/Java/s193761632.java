import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();

            int count = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == 'o') {
                    count++;
                }
            }
            System.out.println(700 + count * 100);
        }
    }
}
