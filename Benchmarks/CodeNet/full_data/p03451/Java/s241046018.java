import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int[][] a = new int[2][N];
        int tmpSum = 0;
        List<Integer> sum = new ArrayList<>();
        int j;
        int max;

        for (int i = 0; i < 2; i++) {
            for (j = 0; j < N; j++) {
                a[i][j] = stdIn.nextInt();
            }
            System.out.println();
        }

        for (int k = 0; k < N; k++) {
            for (j = 0; j < N - k; j++) {
                tmpSum += a[0][j];
            }
            sum.add(tmpSum);
            tmpSum = 0;
        }

        for (int k = 0; k < N; k++) {
            for (j = 0; j < k + 1; j++) {
                tmpSum += a[1][N - j - 1];
                sum.set(k, sum.get(k) + tmpSum);
                tmpSum = 0;
            }
        }

        max = sum.get(0);
        for (int index = 0; index < sum.size(); index++) {
            max = Math.max(max, sum.get(index));
        }
        System.out.println(max);
    }

}
