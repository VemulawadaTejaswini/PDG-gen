

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int prev = a[0];
        int times = 1;
        int changepoint = a[0];
        for (int i = 1; i < n; i++) {

            if (a[i] > prev) {

            } else if (a[i] > changepoint) {
                
            } else {
                changepoint = prev;
                times += 1;
            }

            prev = a[i];
        }

        System.out.print(times);

    }
}