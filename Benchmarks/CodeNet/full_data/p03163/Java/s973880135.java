import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int maxWeight = sc.nextInt();
        int[] weights = new int[count];
        int[] values = new int[count];
        for (int i = 0; i < count; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }
        int[][] res = new int[count][maxWeight + 1];
        for (int i = 0; i < count; i++) {
            for(int j= 0; j < maxWeight; j++) {
                res[i][j] = -1;
            }
        }
        for(int j= 0; j <= maxWeight; j++) {
            if (weights[0] >= j) {
                res[0][j] = values[0];
            } else {
                res[0][j] = 0;
            }
        }

        System.out.println(calculate(res, weights, values, count - 1, maxWeight));
    }


    public static int calculate(int[][] res, int[] weights, int[] values, int index, int weight) {
        if (index == 0) {
            return res[index][weight];
        }
        if (res[index][weight] != -1 ) {
            return res[index][weight];
        }
        int curWeight = weights[index];

        int without =  calculate(res, weights, values, index - 1, weight );
        int with = 0;
        if (weight - curWeight >= 0 ) {
            with = calculate(res, weights, values, index - 1, weight - curWeight);
        }
        res[index][weight] = Math.max(without, with);
        return res[index][weight];
    }
}