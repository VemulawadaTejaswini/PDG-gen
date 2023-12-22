import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int ans = 0;
        for (int i = 1 ; i <= k ; i++) {
            for (int j = 1 ; j <= k ; j++) {
                for (int m = 1 ; m <= k ; m++) {
                    int d = gcd(i, gcd(j, m));
                    ans += d;
                }
            }
        }
        System.out.println(ans);
    }


    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

}