import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String S = sc.next();
            System.out.println(S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5) ? "Yes" : "No");
        }
    }
}
