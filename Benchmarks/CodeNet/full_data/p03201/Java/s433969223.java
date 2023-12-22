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
        Arrays.sort(a);
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            int req = 0;
            if (a[i] == 0) {
                continue;
            }
            for (int j = 0; j < 33; j++) {
                if (Math.pow(2, j) > a[i]) {
                    req = (int)Math.pow(2, j) - a[i];
                    break;
                }
            }
            int min = 0;
            int max = i - 1;
            while (max >= min) {
                if (a[(min + max) / 2] > req) {
                    max = (min + max) / 2 - 1;
                } else if (a[(min + max) / 2] < req) {
                    min = (min + max) / 2 + 1;
                } else {
                    a[i] = 0;
                    a[(min + max) / 2] = 0;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}