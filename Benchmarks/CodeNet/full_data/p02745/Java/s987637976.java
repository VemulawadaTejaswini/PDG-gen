import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        char[] c = sc.next().toCharArray();

        boolean ab[] = new boolean[100000];
        boolean ac[] = new boolean[100000];
        boolean bc[] = new boolean[100000];

        for (int i = 0; i < 100000; i++) {
            ab[i] = true;
            ac[i] = true;
            bc[i] = true;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (!match(a[i], b[j])) {
                    ab[i - j + 50000] = false;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (!match(a[i], c[j])) {
                    ac[i - j + 50000] = false;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (!match(b[i], c[j])) {
                    bc[i - j + 50000] = false;
                }
            }
        }

        int min = 10000;
        for (int i = -4000; i < 4000; i++) {
            for (int j = -4000; j < 4000; j++) {
                if (ab[50000 + i] && ac[50000 + j] && bc[j-i+ 50000]) {
                    int L = Math.min(0, Math.min(i, j));
                    int R = Math.max(a.length, Math.max(i + b.length, j + c.length));
                    min = Math.min(min, R - L);
                }
            }
        }

        System.out.println(min);
    }

    static boolean match(char c1, char c2) {
        return (c1 == '?') || (c2 == '?') || (c1 == c2);
    }
}
