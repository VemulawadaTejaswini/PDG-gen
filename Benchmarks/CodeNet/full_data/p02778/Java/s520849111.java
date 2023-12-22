import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();

            StringBuilder result = new StringBuilder(S.length());
            for(int i = 0; i < S.length(); i++) {
                result.append("x");
            }

            System.out.println(result);
        }
    }
}