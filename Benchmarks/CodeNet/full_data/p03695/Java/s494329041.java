import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        int wc = 0;
        for (int i = 0; i < n; i++) {
            int r = a[i] / 400;
            if (r < 8) {
                set.add(r);
            } else {
                wc++;
            }
        }

        long count = set.size();
        long min = Math.max(count, 1);
        long max = count + wc;

        System.out.println(String.format("%d %d", min, max));
    }
}