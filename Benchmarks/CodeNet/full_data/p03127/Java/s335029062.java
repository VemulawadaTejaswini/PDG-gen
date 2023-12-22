import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int i = 1; i < n; i++) {
            min = gcd(min, a[i]);
        }
        System.out.println(min);
    }

    public static int gcd(int a, int b) {
        if( b == 0 ) return a;
        return gcd(b, a % b);
    }
}