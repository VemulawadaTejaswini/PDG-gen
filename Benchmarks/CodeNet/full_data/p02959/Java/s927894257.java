import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = n - 1; 0 <= i; i--) {
            int x = b[i] - a[i + 1];
            if (x > 0) {
                a[i + 1] = 0;
                b[i] = x;
            } else {
                a[i + 1] = Math.abs(x);
                b[i]= 0;
            }
            if (b[i] == 0) {
                continue;
            }
            int y = b[i] - a[i];
            if (y > 0) {
                a[i] = 0;
                b[i] = x;
            } else {
                a[i] = Math.abs(y);;
                b[i] = y;
            }
       }

       int cnt = 0;
       for (int i = 0; i < n + 1; i++) {
           cnt += a[i];
       }
       if (cnt > 0) {
        System.out.println(sum - cnt);
        System.exit(0);
       }
       System.out.println(sum);
    }
}