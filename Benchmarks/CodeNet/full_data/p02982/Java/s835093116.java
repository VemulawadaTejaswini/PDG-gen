import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][];
        for (int i = 0; i < n; i++) {
            x[i] = new int[d];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        sc.close();

        long[] candidates = new long[n * n];
        int counter = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                candidates[counter] = 0;
                for (int k = 0; k < d; k++) {
                    candidates[counter] += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                }
                counter++;
            }
        }

        // for debug
//        for (int i = 0; i < n * n; i++) {
//            System.out.println(candidates[i]);
//        }

        Set<Long> answerSet = new HashSet<>();
        int max = (20 - (-20)) * (20 - (-20)) * 100;
//        System.out.println(max);
        for (int i = 1; i < max; i++) {
            long tmp = i * i;
            if (tmp > max) {
                break;
            }
            answerSet.add(tmp);
        }
        // for debug
//        System.out.println(answerSet);

        int ans = 0;
        for (long i : candidates) {
            if (answerSet.contains(i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
