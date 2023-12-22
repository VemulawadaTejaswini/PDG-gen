import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i - 1) == S.charAt(i)) {
                    System.out.println("Bad");
                    return;
                }
            }
            System.out.println("Good");
        }
    }
}
