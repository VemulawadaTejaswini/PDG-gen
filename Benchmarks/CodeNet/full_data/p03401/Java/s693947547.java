import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int points[] = new int[N];
        int sortedpoints[] = new int[N];

        for (int i = 0; i < N; i++) {
            points[i] = sc.nextInt();
            sortedpoints[i] = points[i];
        }

        Arrays.sort(sortedpoints);

        int max = sortedpoints[N - 1];
        int min = sortedpoints[0];

        Integer cost_middle = null;

        for (int i = 0; i < N; i++) {
            int cost = 0;
            int current = 0;

            if (cost_middle != null && points[i] != max && points[i] != min) {
                System.out.println(cost_middle);
                continue;
            }

            for (int j = 0; j < N; j++) {
                if (i == j) { continue; }
                cost += Math.abs(points[j] - current);
                current = points[j];
            }

            cost += Math.abs(0 - current);

            if (cost_middle == null && points[i] != max && points[i] != min) {
                cost_middle = cost;
            }

            System.out.println(cost);
        }

    }
}
