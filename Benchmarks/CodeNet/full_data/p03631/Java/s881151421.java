import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String a = sc.next();
        String b = new StringBuilder(a).reverse().toString();

        System.out.println(a.equals(b) ? "Yes" : "No");
    }
}