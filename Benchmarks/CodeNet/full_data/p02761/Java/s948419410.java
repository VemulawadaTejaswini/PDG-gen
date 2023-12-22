import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] s = new int[m];
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            s[i] = in.nextInt();
            c[i] = in.nextInt();
        }
        int limit = 1;
        for (int i = 0; i < n; i++) {
            limit *= 10;
        }
        for (int i = 0; i < limit; i++) {
            String is = String.valueOf(i);
            if (is.length() != n) {
                continue;
            }
            boolean ok = true;
            for (int j = 0; j < m; j++) {
                if (is.charAt(s[j] - 1) != c[j] + 48) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
