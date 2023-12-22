import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mod = 1000000000 + 7;
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        String s = std.next();
        long[] appearCounts = new long[26];
        int index = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < n; i++) {
                char t = s.charAt(i);
                if (c == t) {
                    appearCounts[index]++;
                    appearCounts[index] = appearCounts[index] % mod;
                }
            }
            index++;
        }

        int ans = 1;
        for (long appearCount : appearCounts) {
            ans *= (appearCount + 1) % mod;
            ans = ans % mod;
        }

        ans--;

        System.out.println(ans);
    }
}
