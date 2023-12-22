import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        int[] l = new int[n+1];
        int[] r = new int[n+1];

        l[0] = 0;
        r[n] = 0;

        for (int i=0; i<n; i++) {
            l[i+1] = gcd(arr[i], l[i]);
        }

        for (int j=n-1; 0<=j; j--) {
            r[j] = gcd(arr[j], r[j+1]);
        }

        int ret = 0;

        for (int i=0; i<n; i++) {
            ret = Math.max(ret, gcd(l[i], r[i+1]));
        }
        ret = Math.max(ret, l[n]);

        for (int i=0; i<n+1; i++) {
//            System.out.print(l[i] + " ");
        }
//        System.out.println();
        for (int i=0; i<n+1; i++) {
//            System.out.print(r[i] + " ");
        }
        System.out.println(ret);


    }

    int gcd(int m, int n) {
        if (n == 0) return m;
        return gcd(n, m%n);
    }


}

