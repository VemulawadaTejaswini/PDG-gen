import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        if (n == 2) {
            so.println(a[1] - a[0]);
            return;
        }
        
        long sum = 0;
        int mid = a.length/2;
        int tail = a[mid];
        
        int l = 0;
        int r = a.length-1;
        if (n % 2 == 0) {
            for (int i = 0; i < n-1; i++) {
                if (i % 2 == 0) {
                    sum += Math.abs(tail - a[l]);
                    tail = a[l];
                    l++;
                } else {
                    sum += Math.abs(tail - a[r]);
                    tail = a[r];
                    r--;
                }
            }
        } else {
            int i = 0;
            int m = n;
            if (a[mid] - a[l] < a[r] - a[mid]) {
                i++; m++;
            }
            for (; i < m-1; i++) {
                if (i % 2 == 0) {
                    sum += Math.abs(tail - a[l]);
                    tail = a[l];
                    l++;
                } else {
                    sum += Math.abs(tail - a[r]);
                    tail = a[r];
                    r--;
                }
            }
        }
        so.println(sum);
    }
}
