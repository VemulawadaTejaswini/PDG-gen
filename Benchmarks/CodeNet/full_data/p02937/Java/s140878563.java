import java.util.*;

class Main {
    static final int NALPHA = 26;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = s.length();
        int m = t.length();
        int T[][] = new int[NALPHA][n];
        for (int i = 0; i < NALPHA; i++) {
            for (int j = 0; j < n; j++) {
                T[i][j] = -1;
            }
        }
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            T[c][i] = 0;
        }
        for (int c = 0; c < NALPHA; c++) {
            int tail = -1;
            for (int i = n-1; i >= 0; i--) {
                if (T[c][i] == 0) {
                    tail = i;
                    break;
                }
            }
            if (tail < 0) continue;
            int x = 0;
            for (int i = 0; i >= - n + 1; i--) {
                int pos = (tail + i + n) % n;
                if (T[c][pos] == 0) {
                    x = 0;
                } else {
                    x += 1;
                }
                T[c][pos] = x;
            }
        }
        /*
        for (int c = 0; c < NALPHA; c++) {
            System.out.printf("%c:%s\n", 'a'+c, Arrays.toString(T[c]));
        }
        */
        long ans = 0;
        int p = 0;
        for (int i = 0; i < m; i++) {
            int c = t.charAt(i) - 'a';
            int d = T[c][p];
            if (d < 0) {
                ans = -1;
                break;
            }
            ans += d + 1;
            p = (p + d + 1) % n;
        }
        System.out.println(ans);

    }
}
