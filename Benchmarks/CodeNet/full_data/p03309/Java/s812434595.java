import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i)
            arr[i] = in.nextInt();

        int lo = -(int)1e9;
        int hi = (int)1e9;

        while (Math.abs(hi - lo) > 1) {
            int mid1 = lo + (hi - lo + 1) / 3;
            int mid2 = hi - (hi - lo + 1) / 3;

            long sum1 = computeSadness(arr, mid1);
            long sum2 = computeSadness(arr, mid2);

            // System.err.println(lo + " " + mid1 + " " + mid2 + " "+ hi);

            if (sum1 < sum2) hi = mid2;
            else lo = mid1;
        }

        System.out.println(Math.min(computeSadness(arr, lo), computeSadness(arr, hi)));
    }

    private static long computeSadness(int[] arr, int b) {
        long s = 0;
        for (int i = 0; i < arr.length; ++i) {
            s += Math.abs(arr[i] - (b + i + 1));
        }
        return s;
    }
}