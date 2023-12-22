import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String O = sc.next();
        String E = sc.next();
        char[] o = O.toCharArray();
        char[] e = E.toCharArray();
        int a = O.length() - E.length();
        for (int i = 0; i < E.length() + a; i++) {
            System.out.print(o[i]);
            if (i < E.length()) {
                System.out.print(e[i]);
            }
        }
        System.out.println();
    }
}