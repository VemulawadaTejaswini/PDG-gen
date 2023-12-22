import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x[] = new int[n];
        int a = -1;
        int origin = -1;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            if (x[i] < 0) {
                a = i;
            } else if (x[i] == 0) {
                origin = i;
            }
        }
        int sum = 0;
        if (a == -1) {
            if (origin == -1) {
                sum = x[k - 1];
            } else {
                if (k == 1) {
                    sum = 0;
                } else {
                    sum = x[k - 2];
                }
            }
        } else {
            int min = 1000000000;
            for (int i = 0; i + k - 1 < n; i++) {
                min = Math.min(min, Math.min(2 * Math.abs(x[i]) + Math.abs(x[i + k - 1]), Math.abs(x[i]) + 2 * Math.abs(x[i + k - 1])));
            }
            sum = min;
        }
        System.out.println(sum);
    }
}