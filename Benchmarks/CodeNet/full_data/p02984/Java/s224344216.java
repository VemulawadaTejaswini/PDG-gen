import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sum += a[i];
        }
        long tmp = 0;
        for (int i = 1; i < n; i+=2) {
            tmp += a[i];
        }
        long yama = sum - tmp*2;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == n-1) {
                System.out.println(yama);
                System.exit(0);
            }
            System.out.print(yama + " ");
            yama = (a[i] - yama/2) * 2;
        }
    }

}
