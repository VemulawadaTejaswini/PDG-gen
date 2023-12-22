import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long countA = b / c;
        long countB = b / d;
        long countC = (a - 1) / c;
        long countD = (a - 1) / d;
        long cd = lcm(c, d);
        long countE = b / cd;
        long countF = (a - 1) / cd;
        
        long ans = countA + countB - countC - countD - (countE - countF);
        ans = b - a + 1 - ans;
        System.out.println(ans);
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }
    
    private static long gcd(long m, long n) {
        if(m < n) {
            long tmp = m;
            m = n;
            n = tmp;
        }
        long reminder = 0;
        while((reminder = m % n) != 0) {
            m = n;
            n = reminder;
        }
        return n;
    }
}