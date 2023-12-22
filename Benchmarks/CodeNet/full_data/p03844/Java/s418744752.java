import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        System.out.println(op.equals("+") ? a + b : a - b);
    }
}