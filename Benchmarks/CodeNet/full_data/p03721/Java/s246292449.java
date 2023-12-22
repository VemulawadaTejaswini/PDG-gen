import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[][] ab = new long[n][2];
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long[] tmp = {a,b};
            ab[i] = tmp;
        }
        Arrays.sort(ab, (a, b) -> Long.compare(a[0], b[0]));
        long sum = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            sum += ab[i][1];
            if (sum >= k) {
                ans = ab[i][0];
                break;
            }
        }
        System.out.println(ans);
    }

}
