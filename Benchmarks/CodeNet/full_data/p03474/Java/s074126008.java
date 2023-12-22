import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        System.out.println(isValid(s, a, b) ? "Yes" : "No");
    }

    private static boolean isValid(String s, int a, int b) {
        if (s.charAt(a) != '-') {
            return false;
        }
        for (int i = 0; i < a; i++) {
            if (!isDigit(s.charAt(i))) return false;
        }
        for (int i = a + 1; i < a + b + 1; i++) {
            if (!isDigit(s.charAt(i))) return false;
        }
        return true;
    }

    private static boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }
}
