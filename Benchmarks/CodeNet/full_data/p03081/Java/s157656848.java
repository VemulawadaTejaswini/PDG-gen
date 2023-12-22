import java.util.Arrays;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), q = scanner.nextInt();
        int l = -1;
        String s = scanner.next();
        char[] t = new char[q], d = new char[q];
        for (int i = 0; i < q; i++) {
            t[i] = scanner.next().charAt(0);
            d[i] = scanner.next().charAt(0);
            if (t[i] == s.charAt(0) && d[i] == 'L')
                l = i;
        }

        long ans = 0;
        if (l != -1) {
            boolean b = false;
            int a = 0;
            for (int i = l; i >= 0; i--) {
                if (t[i] == s.charAt(a)) {
                    if (d[i] == 'L') {
                        ans++;
                        a++;
                        b = false;
                    } else {
                        b = true;
                    }
                }
            }
            if (b)
                ans--;
        }
        boolean b = false;
        int a = n - 1;
        for (int i = q - 1; i >= 0; i--) {
            if (t[i] == s.charAt(a)) {
                if (d[i] == 'R') {
                    ans++;
                    a--;
                    b = false;
                } else {
                    b = true;
                }
            }
        }
        if (b) ans--;
        System.out.println(n - ans);
    }
}