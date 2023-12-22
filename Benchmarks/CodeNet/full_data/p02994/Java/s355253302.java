import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, L;
        N = scan.nextInt();
        L = scan.nextInt();
        int[] apple = new int[N];
        if (L > 0) {
            for (int i = 0; i < N; i++) {
                apple[i] = L + (i + 1) - 1;
            }
            quick_sort(apple, 0, N - 1);
            int taste = 0;
            for (int i = 1; i < N; i++) {
                taste += apple[i];
            }
            System.out.println(taste);
        } else {
            int taste = 0;
            int index = 0;
            for (int i = 0; i < N; i++) {
                apple[i] = L + (i + 1) - 1;
            }
            int[] copyapple = new int[N];
            for (int i = 0; i < N; i++) {
                copyapple[i] = (int) Math.abs(L + (i + 1) - 1);
            }
            quick_sort(copyapple, 0, N - 1);
            if (copyapple[0] == 0) {
                for (int i = 0; i < N; i++) {
                    if (apple[i] != 0) {
                        taste += apple[i];
                    }
                }
            } else {
                quick_sort(apple, 0, N - 1);
                for (int i = 0; i < N - 1; i++) {
                    taste += apple[i];
                }
            }
            System.out.println(taste);
        }
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