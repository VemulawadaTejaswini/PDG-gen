import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static HashMap<String, Integer> cache = new HashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            boolean first = false;
            int gcd = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                if (first) {
                    gcd = a[j];
                }
                gcd = gcd(a[j], gcd);
            }
            answer[i] = gcd;
        }
        Arrays.sort(answer);
        System.out.println(answer[N-1]);
    }
    public static int gcd(int x, int y) {
        String key = x + ":" + y;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        if (y == 0) {
            cache.put(key, x);
            return x;
        }
        int ans = gcd(y, x % y);
        cache.put(key, ans);
        return ans;
    }
}
