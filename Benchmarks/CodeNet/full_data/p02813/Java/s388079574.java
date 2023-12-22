import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }
        System.out.println(Math.abs(dictLen(p) - dictLen(q)));
    }

    private static int dictLen(final int[] a) {
        final List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            integers.add(i + 1);
        }
        int ret = 0;
        for (int i = 0; i < a.length; i++) {
            final int idx = integers.indexOf(a[i]);
            final int fact = fact(integers.size());
            ret += fact / integers.size() * idx;
            integers.remove(idx);
        }
        return ret;
    }
    private static int fact(int n) {
        int ret = 1;
        for (int i = 2; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
}
