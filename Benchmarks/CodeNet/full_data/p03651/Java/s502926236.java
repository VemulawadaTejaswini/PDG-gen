import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;
        int gcd = 0;
        for (int i= 0; i < n; i++) {
            int m = sc.nextInt();
            max = Math.max(max, m);
            gcd = findGcd(gcd, m);
        }
        if (k <= max && k % gcd == 0) {
            System.out.println("POSSIBLE");
        } else  {
            System.out.println("IMPOSSIBLE");
        }

    }
    private static int findGcd(int a, int b) {
        while (b > 0) {
            int t = a % b;
            a = b;
            b = t;
        }

        return a;
    }
}