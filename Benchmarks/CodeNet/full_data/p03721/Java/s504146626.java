import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        int[] b = new int[n];
        long[] c = new long[n];
        long d = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            d += (long) b[i];
            c[i] = d;
        }
        for (int i = 0 ; i < n ; i++) {
            if (c[i] >= k) {
                System.out.println(a[i ]);
                return;
            }
        }


    }

}