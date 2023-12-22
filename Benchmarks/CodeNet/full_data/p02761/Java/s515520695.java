import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int[] digit = new int[n];
        Arrays.fill(digit, -1);
        int m = Integer.parseInt(stdIn.next());
        int[] s = new int[m];
        int[] c = new int[m];
        boolean check = true;
        for (int i = 0; i < m; i++) {
            s[i] = Integer.parseInt(stdIn.next());
            c[i] = Integer.parseInt(stdIn.next());
            if (digit[s[i] - 1] != -1 && digit[s[i] - 1] != c[i]) {
                check = false;
            }
            digit[s[i] - 1] = c[i];
        }
        if (n != 1 && digit[0] == 0) {
            check = false;
        }

        int ans = 0;
        if (check) {
            if (m != 0) {
                for (int i = 0; i < n; i++) {
                    if (i == 0 && digit[i] == -1) {
                        ans += Math.pow(10, n - 1);
                    } else if (digit[i] != -1) {
                        ans += digit[i] * Math.pow(10, n - i - 1);
                    }
                }
            } else if (m == 0 && n != 1) {
                ans = (int)Math.pow(10, n - 1);
            }
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }
}