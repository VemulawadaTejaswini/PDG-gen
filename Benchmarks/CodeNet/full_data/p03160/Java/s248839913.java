package jp.atcoder.dp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int jumpCost(int start, int jumpLength, int end, int[] height) {
        if (start + jumpLength == end) {
            return Math.abs(height[start + jumpLength] - height[start]);
        }
        if (start + jumpLength > end) {
            return Integer.MAX_VALUE;
        } else {
            return Math.abs(height[start + jumpLength] - height[start])
                    + Math.min(
                    jumpCost(start + jumpLength, 1, end, height),
                    jumpCost(start + jumpLength, 2, end, height));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int totalCost = 0;
        totalCost = Math.min(jumpCost(0, 1, n - 1, height), jumpCost(0, 2, n - 1, height));
        System.out.println(totalCost);

//        for (int i = 0; i < n; i++) {
//            System.out.printf("%d ", height[i]);
//        }


    }
}
