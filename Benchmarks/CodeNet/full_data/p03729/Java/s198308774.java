import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();

        boolean ab = (a.charAt(a.length() - 1) == b.charAt(0));
        boolean bc = (b.charAt(b.length() - 1) == c.charAt(0));

        System.out.println(ab && bc ? "YES" : "NO");
    }
}