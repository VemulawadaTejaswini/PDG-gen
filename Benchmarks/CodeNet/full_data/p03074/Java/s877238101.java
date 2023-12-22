import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        sc.close();
        int change = 0;
        char c = s.charAt(0);
        boolean fzero = true;
        if (c == '0') {

        } else {
            fzero = false;
        }
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (c != cc) {
                change++;
                c = cc;
            }
        }
        int[] cntrow = new int[change + 1];
        int cnt = 1;
        int pos = 0;
        c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char cc = s.charAt(i);

            if (c != cc) {
                cntrow[pos] = cnt;
                cnt = 1;
                pos++;
                c = cc;
                if (i == s.length() - 1) {
                    cntrow[pos] = cnt;
                }
            } else {
                cnt++;
                if (i == s.length() - 1) {
                    cntrow[pos] = cnt;
                }
            }
        }
        if (change == 0) {
            System.out.println(s.length());
            return;
        }
        int tmp = 0;
        int ans = 0;
        for (int i = 0; i < 2 * k; i++) {
            if (i > change) {
                System.out.println(tmp);
                return;
            }
            tmp += cntrow[i];
        }

        /*
         * for (int i = 0; i < change + 1; i++) { System.out.println(cntrow[i]); }
         * 
         * System.out.println(change);
         */
        int f = 2 * k;
        if (!fzero && f <= change) {
            tmp += cntrow[f];
            f = f + 1;
        }
        ans = tmp;
        // System.out.println(ans);

        boolean zero = fzero;
        // System.out.println(zero);
        int posl = 0;
        int posr = f;
        while (true) {
            if (posr > change) {
                break;
            }
            if (zero) {
                tmp += cntrow[posr];
                tmp -= cntrow[posl];
                if (posr + 1 <= change) {
                    // System.out.println(tmp + cntrow[posr + 1]);
                    if (ans < tmp + cntrow[posr + 1]) {
                        ans = tmp + cntrow[posr + 1];

                    }
                }
            } else {
                tmp += cntrow[posr];
                tmp -= cntrow[posl];
                if (ans < tmp) {
                    ans = tmp;
                    // System.out.println(ans);
                }
            }
            posr++;
            posl++;
            zero = !zero;
        }
        System.out.println(ans);

    }
}