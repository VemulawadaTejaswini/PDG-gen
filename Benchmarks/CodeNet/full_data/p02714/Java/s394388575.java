import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final char[] cs = sc.next().toCharArray();

        long r = 0;
        long g = 0;
        long b = 0;
        for (char c : cs) {
            if (c == 'R') r++;
            if (c == 'G') g++;
            if (c == 'B') b++;
        }

        long all = r * g * b;

        long sub = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (cs[i] == cs[j]) continue;
                int k = j*2 - i;
                if (k >= n || cs[k] == cs[i] || cs[k] == cs[j]) continue;
                sub++;
            }
        }

        System.out.println(all-sub);
    }
}
