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

        long tv = 1;
        long av = 1;
        for (int i = 0; i < n; i++) {
            long m = (long) Math.max(Math.ceil((double) av / a[i]), Math.ceil((double) tv / t[i]));
            tv = m * t[i];
            av = m * a[i];
        }
        System.out.println(av + tv);

    }

}