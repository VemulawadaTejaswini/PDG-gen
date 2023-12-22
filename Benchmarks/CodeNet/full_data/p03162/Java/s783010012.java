import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
3
10 40 70
20 50 80
30 60 90

210
 */
public class Main {
    static long[] mindist;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        mindist = new long[1000000];
        Arrays.fill(mindist, Long.MIN_VALUE);

        List<Integer> list = new ArrayList<>();
        list.add(0, scanner.nextInt());
        list.add(1, scanner.nextInt());
        list.add(2, scanner.nextInt());

        int max = Collections.max(list);
        mindist[0] = max;
        int prev_act = list.indexOf(max);

        for (int i = 1; i < N; i++) {
            max = Integer.MIN_VALUE;
            list.set(0, scanner.nextInt());
            list.set(1, scanner.nextInt());
            list.set(2, scanner.nextInt());

            list.set(prev_act, Integer.MIN_VALUE);
            max = Collections.max(list);
            prev_act = list.indexOf(max);

            mindist[i] = mindist[i - 1] + Math.max(mindist[i], max);
        }

        System.out.println(mindist[N - 1]);
    }
}