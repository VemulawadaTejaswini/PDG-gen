import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(lcm(m,n));
    }

    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    private static int lcm(int m, int n) {
        return m * n / gcd(m, n);
    }

}
