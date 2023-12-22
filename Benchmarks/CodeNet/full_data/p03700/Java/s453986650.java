import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long es[] = new long[n];
        for (int i = 0; i < n; i++) {
            es[i] = sc.nextLong();
        }
        Arrays.sort(es);
        long ans;
        long l = 0, r = 1000000000L;
        while (r - l > 1) {
            ans = (r - l) / 2 + l;
            if (check(es, ans, a, b)) {
                r = ans;
            }
            else {
                l = ans;
            }
        }
        System.out.println(r);
    }

    static boolean check(long[] es, long t, long a, long b) {
        int idx = 0;
        long add = a - b;
        long base = b * t;
        while(idx < es.length && es[idx] <= base) idx++;
        long count = 0;
        for (; idx < es.length; idx++) {
            count += (es[idx] - base + add - 1) / add;
        }
        return count <= t;
    }
}
