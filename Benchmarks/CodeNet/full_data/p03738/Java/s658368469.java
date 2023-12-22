import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        if (A.length() > B.length()) {
            System.out.println("GREATER");
            return;
        } else if (A.length() < B.length()) {
            System.out.println("LESS");
            return;
        }
        for (int i = 0; i < A.length(); i++) {
            if ((int) a[i] > (int) b[i]) {
                System.out.println("GREATER");
                return;
            } else if ((int) a[i] < (int) b[i]) {
                System.out.println("LESS");
                return;
            }
            if (i == A.length() - 1) {
                System.out.println("EQUAL");
            }
        }
    }
}