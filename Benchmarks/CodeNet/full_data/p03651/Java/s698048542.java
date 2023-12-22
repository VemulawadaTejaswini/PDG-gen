import java.util.Scanner;

public class Main {
    static long MOD = 109 + 7;

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }


    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        int gcd = a[0];
        int max = a[0];
        for(int i = 1; i < n; i++) {
            gcd = gcd(gcd, a[i]);
            max = Math.max(max, a[i]);
        }

        String POSSIBLE = "POSSIBLE";
        String IMPOSSIBLE = "IMPOSSIBLE";
        if(k > max) {
            System.out.println(IMPOSSIBLE);
        } else if(k % gcd != 0) {
            System.out.println(IMPOSSIBLE);
        } else {
            System.out.println(POSSIBLE);
        }
    }
}