import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        long ans = 0;
        long acnt = 0;
        long bacnt = 0;
        long bcnt = 0;
        boolean onaji = false;
        for (int i = 0; i < n; i++) {
            if (s[i].contains("AB")) {
                for (int j = 0; j < s[i].length() - 1; j++) {
                    char c = s[i].charAt(j);
                    char d = s[i].charAt(j + 1);
                    if (c == 'A' && d == 'B') {
                        ans++;
                    }
                }
            }
            if (s[i].charAt(s[i].length() - 1) == 'A') {

                if (s[i].charAt(0) == 'B') {
                    bacnt++;
                } else {
                    acnt++;
                    if (s[i].charAt(0) == 'A') {
                        onaji = true;
                    }
                }
            }
            if (s[i].charAt(0) == 'B') {
                if (s[i].charAt(s[i].length() - 1) == 'A') {
                } else {
                    if (s[i].charAt(s[i].length() - 1) == 'B') {
                        onaji = true;
                    }
                    bcnt++;
                }
            }
        }
        long[] tmp = { acnt, bcnt };
        Arrays.sort(tmp);
        // ppa と bpp の組み合わせ
        long add = tmp[0];
        long amari = (tmp[1] - tmp[0]);
        if (amari == 0) {
            if (onaji) {
                add += bacnt;
            } else if (bacnt > 1) {
                add += bacnt - 1;
            }

        }
        if (amari > 0) {
            add += bacnt;
        }
        ans += add;

        System.out.println(ans);

        sc.close();
    }
}