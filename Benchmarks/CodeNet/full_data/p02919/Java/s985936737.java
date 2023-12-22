import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] P = new int[N];
        int[] pos = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt() - 1;
            pos[P[i]] = i;
        }

        NavigableSet<Integer> used = new TreeSet<>();
        long sol = 0;

        for (int p = N - 1; p >= 0; p--) {
            int i = pos[p];

            Integer firstLower = used.lower(i);
            firstLower = firstLower == null ? -1 : firstLower;

            Integer secondLower = used.lower(firstLower);
            secondLower = secondLower == null ? -1 : secondLower;

            Integer firstHigher = used.higher(i);
            firstHigher = firstHigher == null ? N : firstHigher;

            Integer secondHigher = used.higher(firstHigher);
            secondHigher = secondHigher == null ? N : secondHigher;

            long times = ((long) (firstLower - secondLower)) * (firstHigher - i);
            times += ((long) (i - firstLower)) * (secondHigher - firstHigher);

            sol += times * (p + 1);
            used.add(i);
        }

        System.out.println(sol);
    }
}
