/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] h = new long[n];
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        long solve = dp(n, h, a);
        System.out.println(solve);
    }

    public static long dp(int n, long[] h, long[] a) {
        long[] max = new long[n];
        for (int i = 0; i < n; i++) {
            max[i] = a[i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (h[j] < h[i]) {
                    max[i] = (long)Math.max(max[i], a[i] + max[j]);
                }
            }
        }
        return max[max.length - 1];
    }
}
