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
        int l = 0;
        int r = a.length-1;
        
        sum += a[r] + a[r-1] - a[0] * 2;
        int left = a[r];
        int right = a[r-1];
        r -= 2;
        l += 1;
        int count = 0;
        while (l <= r) {
            if (left < right) {
                if (count / 2 % 2 == 0) {
                    sum += Math.abs(right - a[l]);
                    right = a[l];
                    l++;
                    
                } else {
                    sum += Math.abs(left - a[r]);
                    left = a[r];
                    r--;
                }
            } else {
                if (count / 2 % 2 == 0) {
                    sum += Math.abs(left - a[l]);
                    left = a[l];
                    l++;
                } else {
                    sum += Math.abs(right - a[r]);
                    right = a[r];
                    r--;
                }
            }
            count++;
        }
        System.out.println(sum);
    }
}
