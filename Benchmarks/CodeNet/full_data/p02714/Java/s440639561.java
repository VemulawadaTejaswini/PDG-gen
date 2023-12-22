import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] r = new int[n];
        int[] g = new int[n];
        int[] b = new int[n];
        for (int i = 0 ; i < n ; i++) {
            if (s[i] == 'R') r[i]++;
            if (s[i] == 'G') g[i]++;
            if (s[i] == 'B') b[i]++;
        }
        int[] rs = new int[n+ 1];
        int[] gs = new int[n + 1];
        int[] bs  = new int[n + 1];
        for (int i = 0 ; i < n ; i++) {
            rs[i + 1] = rs[i] + r[i];
            gs[i + 1] = gs[i] + g[i];
            bs[i + 1] = bs[i] + b[i];
        }
        long ans = 0;
        for (int i = 1 ; i < n - 1 ; i++) {
            if (s[i] == 'R') {
                for (int j = 0 ; j < i ; j++) {
                    if (s[j] == 'B') {
                        ans += gs[n] - gs[i];
                        if (i + i - j < n && s[i + i - j] == 'G') {
                            ans -= 1;
                        }
                    }
                    if (s[j] == 'G') {
                        ans += bs[n] -bs[i];
                        if (i + i - j < n && s[i + i - j] == 'B') {
                            ans -= 1;
                        }
                    }
                }
            }
            if (s[i] == 'G') {
                for (int j = 0 ; j < i ; j++) {
                    if (s[j] == 'B') {
                        ans += rs[n] - rs[i];
                        if (i + i - j < n && s[i + i - j] == 'R') {
                            ans -= 1;
                        }
                    }
                    if (s[j] == 'R') {
                        ans += bs[n] - bs[i];
                        if (i + i - j < n && s[i + i - j] == 'B') {
                            ans -= 1;
                        }
                    }
                }
            }
            if (s[i] == 'B') {
                for (int j = 0 ; j < i ; j++) {
                    if (s[j] == 'G') {
                        ans += rs[n] - rs[i];
                        if (i + i - j < n && s[i + i - j] == 'R') {
                            ans -= 1;
                        }
                    }
                    if (s[j] == 'R') {
                        ans += gs[n] - gs[i];
                        if (i + i - j < n && s[i + i - j] == 'G') {
                            ans -= 1;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

}