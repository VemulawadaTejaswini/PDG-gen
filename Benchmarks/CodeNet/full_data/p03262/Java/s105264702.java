import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int[] d = new int[N];
        for(int i = 0; i < N; i++) {
            d[i] = Math.abs(Integer.parseInt(sc.next()) - X);
        }

        int D_max = d[0];
        for(int i = 1; i < d.length; i++) {
            D_max = D_max > d[i] ? gcd(D_max, d[i]) : gcd(d[i], D_max);
        }
        System.out.println(D_max);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
