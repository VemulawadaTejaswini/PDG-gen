import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        long T = 1;
        long A = 1;
        for (int i = 0 ; i < n ; i++ ) {
            long x = 0;
            long y = 0;
            if (T % t[i] == 0) {
                x = T / t[i];
            } else {
                x = T / t[i] + 1;
            }
            if (A % a[i] == 0) {
                y = A / a[i];
            } else {
                y= A / a[i] + 1;
            }
            T = Math.max(x, y) * t[i];
            A = Math.max(x, y) * a[i];
        }
        System.out.println(T + A);

    }

}