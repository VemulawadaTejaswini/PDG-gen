import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] as = new int[n];

        for(int tmp = 0; tmp < n; tmp++){
            as[tmp] = sc.nextInt();
        }
        long lcmNum = as[0];
        for(int tmp = 1; tmp < n; tmp++){
            lcmNum = lcm(lcmNum, as[tmp]);
        }

        long result = 0;

        for(int tmp = 0; tmp < n; tmp++){
            result += (lcmNum - 1) % as[tmp];
        }


        System.out.println(result);
    }

    //最小公約数
    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    //最大公約数
    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}