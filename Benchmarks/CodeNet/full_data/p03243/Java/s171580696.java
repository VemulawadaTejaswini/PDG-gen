import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true) {
            if (ok(n)) {
                System.out.println(n);
                return;
            }
            n++;
        }
    }
    public static boolean ok(int x) {
        String s = String.valueOf(x);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(0)) return false;
        }
        return true;
    }
}