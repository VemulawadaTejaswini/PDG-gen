import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        int[] copyA = new int[N];
        copyA = (int[])A.clone();
        quick_sort(copyA, 0, N-1);
        int max = copyA[N - 1];
        int max2 = copyA[N - 2];
        for (int i = 0; i < N; i++) {
            if (A[i] == max) {
                System.out.println(max2);
            } else {
                System.out.println(max);
            }
        }
        scan.close();
    }

    static void quick_sort(int[] d, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = d[(left + right) / 2];
        int l = left, r = right, tmp;
        while (l <= r) {
            while (d[l] < p) {
                l++;
            }
            while (d[r] > p) {
                r--;
            }
            if (l <= r) {
                tmp = d[l];
                d[l] = d[r];
                d[r] = tmp;
                l++;
                r--;
            }
        }
        quick_sort(d, left, r);
        quick_sort(d, l, right);
    }
}