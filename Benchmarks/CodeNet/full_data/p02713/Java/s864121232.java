import java.util.Scanner;

public class Main {
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt() +1;
        int ans = 0;

        for (int i = 1; i <a; i++) {
            for (int j = 1; j <a; j++) {
                for (int k = 1; k <a ; k++) {
 //                   System.out.println(i+""+j+""+k);
                    ans += gcd(gcd(i,j),k) ;
                }
            }
        }

        System.out.println(ans);
    }
}
