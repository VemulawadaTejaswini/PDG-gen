import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = Math.abs(a[0]);
        for (int i = 1; i < n; i++) {
            sum += Math.abs(a[i] - a[i - 1]);
        }
        sum += Math.abs(a[n - 1]);
        if ((a[0] >= 0 && a[0] <= a[1]) || (a[0] <= 0 && a[1] <= a[0])) {
            System.out.println(sum);
        } else {
            System.out.println(sum - 2 * Math.abs(a[0]));
        }
        for (int i = 1; i < n - 1; i++) {
            if ((a[i] >= a[i - 1] && a[i] <= a[i + 1]) || (a[i] <= a[i - 1] && a[i] >= a[i + 1])) {
                System.out.println(sum);
            } else if (Math.abs(a[i] - a[i - 1]) < Math.abs(a[i] - a[i + 1])) {
                System.out.println(sum - 2 * Math.abs(a[i] - a[i - 1]));
            } else {
                System.out.println(sum - 2 * Math.abs(a[i] - a[i + 1]));
            }
        }
        if ((a[n - 2] <= a[n - 1] && a[n - 1] <= 0) || (a[n - 2] >= a[n - 1] && a[n - 1] >= 0)) {
            System.out.println(sum);
        } else if (a[n - 2] * a[n - 1] < 0){
            System.out.println(sum - 2 * Math.abs(a[n - 1]));
        } else {
            System.out.println(sum - 2 * Math.abs(a[n - 1] - a[n - 2]));
        }
    }
}