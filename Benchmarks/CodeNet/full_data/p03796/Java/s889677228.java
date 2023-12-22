import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long mod = 1000000007;
        long ans = 1;
        for (int i = 1 ; i <= n ; i++) {
            ans *= i ;
            ans %= mod;
        }
        System.out.println(ans);
    }

}