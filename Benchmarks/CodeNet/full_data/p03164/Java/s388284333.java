
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
        for (int i = 0; i < count; i++) {
            for(int j= 0; j <= maxValue; j++) {
                res[i][j] = Integer.MAX_VALUE;
            }
        }
        for(int j= 0; j <= maxValue; j++) {
            if (values[0] <= j) {
                res[0][j] = weights[0];
            }
        }
        long result = calculate(res, weights, values, count - 1, maxValue);
        int min = 0;
        for (int i = 0 ; i < count; i++) {
            for (int j = 0 ; j < maxValue; j++) {
                if (res[i][j] <= maxWeight) {
                    min = Math.max(j, min);
                }
            } 
        }
        System.out.println(min);
    }

    public static long calculate(long[][] res, long[] weights, int[] values, int index, int value) {
        if (index == 0) {
            return res[index][value];
        }
        if (res[index][value] != Integer.MAX_VALUE ) {
            return res[index][value];
        }
        int curValue = values[index];
        long without = calculate(res, weights, values, index - 1, value);
        long with = Integer.MAX_VALUE;
        if (value > curValue) {
            with = calculate(res,weights, values, index -1, value - curValue) + weights[index];
        }
        res[index][value] = Math.min(without, with);
        return res[index][value];
    }
}