
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            integers.add(i * i);
        }

        int[][] arr = new int[n][d];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] jPoint = arr[j];
                int[] iPoint = arr[i];
                int sum = 0;
                for (int k = 0; k < d; k++) {
                    sum += Math.pow(jPoint[k] - iPoint[k], 2);
                }
                count += (integers.contains(sum) ? 1 : 0);
            }
        }

        System.out.println(count);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
