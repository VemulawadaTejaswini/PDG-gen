import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int maxWeight = sc.nextInt();
        long[] weights = new long[count];
        int[] values = new int[count];
        for (int i = 0; i < count; i++) {
            weights[i] = sc.nextLong();
            values[i] = sc.nextInt();
        }
        int maxValue = 100001;
        long[][] res = new long[count][maxValue];
        boolean[][] b = new boolean[count][maxValue];
        for (int i = 0; i < count; i++) {
            for(int j= 0; j < maxValue; j++) {
                res[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < maxValue; i++) {
            b[0][i] = true;
        }
        res[0][values[0]] = weights[0];
        res[0][0] = 0;
        long result = calculate(res, weights, values, count - 1, maxValue - 1,b);
        int min = 0;
        for (int i = 0 ; i < count; i++) {
            for (int j = 0 ; j < maxValue; j++) {
                if (calculate(res, weights, values,  i, j,b) <= maxWeight) {
                    min = Math.max(j, min);
                }

            }
            System.out.println(Arrays.toString(res[i]));
        }
        System.out.println(min);
    }

    public static long calculate(long[][] res, long[] weights, int[] values, int index, int value, boolean[][] b) {
        if (index == 0) {
            return res[index][value];
        }
        if (b[index][value]) {
            return res[index][value];
        }
        int curValue = values[index];
        long mesame = Integer.MAX_VALUE;
//        if (value > 0) {
//            mesame = calculate(res, weights, values, index, value - 1, b);
//        }
        long without = calculate(res, weights, values, index - 1, value, b);
        long with = Integer.MAX_VALUE;
        if (value >= curValue) {
            with = calculate(res,weights, values, index -1, value - curValue, b) + weights[index];
        }
        res[index][value] = Math.min(Math.min(without, with), mesame);
        b[index][value] = true;
        return res[index][value];
    }
}