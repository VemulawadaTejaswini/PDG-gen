import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = std.nextInt();
        }

        int[] an = Arrays.stream(a).distinct().toArray();
        long restCount = Arrays.stream(an).count();
        List<Long> results = new ArrayList<>();
        results.add((long)n);
        for (int i = 2; i <= n; i++) {
            long r = restCount / i;
            results.add(r);
        }

        results.forEach(System.out::println);
    }
}
