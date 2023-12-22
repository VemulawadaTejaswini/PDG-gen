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
    static long[][] mindist;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        mindist = new long[1000000][3];
        for (long[] longs : mindist) {
            Arrays.fill(longs, Long.MIN_VALUE);
        }

        List<Integer> list = new ArrayList<>();
        list.add(0, scanner.nextInt());
        list.add(1, scanner.nextInt());
        list.add(2, scanner.nextInt());

        mindist[0][0] = list.get(0);
        mindist[0][1] = list.get(1);
        mindist[0][2] = list.get(2);

        int prev_act = 0;
        for (int i = 1; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            for (int k = 0; k < 3; k++) {
                list.set(0, a);
                list.set(1, b);
                list.set(2, c);

                if (i == 1) {
                    prev_act = k;
                }

                list.set(prev_act, Integer.MIN_VALUE);
                int max = Collections.max(list);
                prev_act = list.indexOf(max);

                mindist[i][k] = mindist[i - 1][k] + Math.max(mindist[i][k], max);
            }
        }

        System.out.println(Math.max(Math.max(mindist[N - 1][0], mindist[N - 1][1]), mindist[N - 1][2]));
    }
}