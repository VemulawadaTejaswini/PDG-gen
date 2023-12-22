import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int k = sc.nextInt();
        final int r = sc.nextInt();
        final int s = sc.nextInt();
        final int p = sc.nextInt();
        final String t = sc.next();

        long ans = 0;
        final char[] hands = new char[n];
        for (int i = 0; i < n; i++) {
            final char c = t.charAt(i);
            final char prevHand = i - k >= 0 && hands[i-k] != 0 ? hands[i-k] : 0;
            if (c == 'r') {
                if (prevHand != 'p') {
                    hands[i] = 'p';
                    ans += p;
                }
                if (prevHand == 'p') {
                    hands[i] = 'r';
                }
            }
            if (c == 's') {
                if (prevHand != 'r') {
                    hands[i] = 'r';
                    ans += r;
                }
                if (prevHand == 'r') {
                    hands[i] = 's';
                }
            }
            if (c == 'p') {
                if (prevHand != 's') {
                    hands[i] = 's';
                    ans += s;
                }
                if (prevHand == 's') {
                    hands[i] = 'p';
                }
            }
        }

        System.out.println(ans);
    }
}
