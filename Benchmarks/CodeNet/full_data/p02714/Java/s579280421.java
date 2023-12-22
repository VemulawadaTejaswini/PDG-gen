import java.util.*;

class Main {

    static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {

        long res = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] ch = str.toCharArray();

        int r = 0, g = 0, b = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] == 'R') {
                r++;
            } else if (ch[i] == 'G') {
                g++;
            } else {
                b++;
            }
        }
        res = r * g * b;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (ch[i] != ch[j]) {
                    if ((ch[i] == 'R' || ch[j] == 'R') && (ch[i] == 'G' || ch[j] == 'G')) {
                        if (j * 2 - i < n && ch[j * 2 - i] == 'B') {
                            res--;
                        }
                    } else if ((ch[i] == 'R' || ch[j] == 'R') && (ch[i] == 'B' || ch[j] == 'B')) {
                        if (j * 2 - i < n && ch[j * 2 - i] == 'G') {
                            res--;
                        }
                    } else {
                        if (j * 2 - i < n && ch[j * 2 - i] == 'R') {
                            res--;
                        }
                    }
                }
            }
        }

        System.out.println(res);
        sc.close();
    }
}
