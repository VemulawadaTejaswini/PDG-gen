import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        String d = "" + a.charAt(0) + b.charAt(0) + c.charAt(0);
        System.out.println(d.toUpperCase());
    }
}