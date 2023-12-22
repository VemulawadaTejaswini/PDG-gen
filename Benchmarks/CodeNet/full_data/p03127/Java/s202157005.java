import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int [] b = new int[n];
        int c = gcd(a[0], a[1]);
        b[0] = c;
        for (int i = 1 ; i < n ; i++) {
            b[i] = gcd(b[i - 1], a[i]);
        }


        System.out.println(b[n-1]);
    }
    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}
