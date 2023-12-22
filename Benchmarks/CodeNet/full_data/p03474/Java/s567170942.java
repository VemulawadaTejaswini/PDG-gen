import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        String S = in.next();

        if (isPostCode(S, A, B))
        System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean isPostCode(String s, int a, int b) {
        if (s == null || s.length() == 0) return false;
        if (s.length() != a + b + 1) return false;
        if (a < 1 || a > 5) return false;
        if (b < 1 || b > 5) return false;
        if (s.charAt(a) != '-') return false;
        for (int i = 0; i < a; i++) {
            int c = s.charAt(i) - '0';
            if (c < 0 || c > 9) return false;
        }
        for (int i = a + 1; i < s.length(); i++) {
            int c = s.charAt(i) - '0';
            if (c < 0 || c > 9) return false;
        }
        return true;
    }
}