import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long es[] = new long[n];
        for (int i = 0; i < n; i++) {
            es[i] = sc.nextLong();
        }
        Arrays.sort(es);
        long ans;
        long l = 0, r = Math.max(es[n-1] / b, 1);
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

    static boolean check(long[] es, long t, int a, int b) {
        int idx = 0;
        int add = a - b;
        long base = b * t;
        while(idx < es.length && es[idx] <= base) idx++;
        long count = 0;
        for (; idx < es.length; idx++) {
            count += Math.ceil((es[idx] - base) / add);
        }
        return count <= t;
    }
}
