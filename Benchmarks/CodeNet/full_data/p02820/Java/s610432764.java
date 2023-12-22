import java.util.Scanner;

public class Main {

    public static int r, s, p;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        r = sc.nextInt();
        s = sc.nextInt();
        p = sc.nextInt();

        String t = sc.next();

        int ans = 0;
        int ignore = 0;

        for (int i = 0; i < n; i++) {

            char opponent = t.charAt(i);

            if (i <= k) {
                ans += calc(opponent);
                continue;
            }

            if (i - ignore == k) {
                ans += calc(opponent);
                continue;
            }

            if (t.charAt(i) == t.charAt(i - k)) {
                ignore = i;
                continue;
            }

            ans += calc(opponent);
        }

        System.out.println(ans);
    }

    public static int calc(char opponent) {
        switch (opponent) {
        case 'r':
            return p;

        case 's':
            return r;

        case 'p':
            return s;
        }

        return 0;
    }
}