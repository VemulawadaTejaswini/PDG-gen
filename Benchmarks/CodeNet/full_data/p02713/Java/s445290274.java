import java.util.*;
public class Main {
    static int[][] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long sum = 0;
        memo = new int[202][202];
        for(int i = 1; i<=k; i++) {
            for(int j = 1; j<=k; j++) {
                for(int l = 1; l<=k; l++) {
                    sum += gcdgcd(i,j,l);       
                }
            }
        }
        p(sum);
    }

    public static int gcd(int a, int b) {
        if(b>a) {
            int t = a;
            a = b;
            b = t;
        }
        if(b==0) return a;
        if(memo[b][a%b]==0) memo[b][a%b]= gcd(b, a%b);
        return memo[b][a%b];
    }

    public static int gcdgcd(int a, int b, int c) {
        return gcd(a, gcd(b, c));
    }

    public static <T> void p(T message) {
        System.out.println(message);
    }

    public static <T> void pp(T message) {
        System.out.print(message);
    }
}