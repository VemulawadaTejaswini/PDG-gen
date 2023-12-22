import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
            b[i] = t[i] + a[i];
        }

        long tv = 1;
        long av = 1;
        for (int i = 0; i < n; i++) {
            long x = 0;
            if (tv > av) {
                x = (long) Math.ceil((double) tv / t[i]);
                av = x * a[i];
                tv = x * t[i];
            } else {
                x = (long) Math.ceil((double) av / a[i]);
                av = x * a[i];
                tv = x * t[i];
            }
        }
        System.out.println(av + tv);

    }

}