import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        int c = sc.nextInt();
        int d = sc.nextInt();

        long count = b - a + 1;

        count -= counter(a, b, c);
        count -= counter(a, b, d);
        count += counter(a, b, lcm(c, d));

        System.out.println(count);
        sc.close();
    }

    static int gcd(int m, int n) {
        if (m < n)
            return gcd(n, m);
        if(n == 0)
            return m;
        return gcd(n, m%n);
    }

    static int lcm(int m, int n){
        return ((m*n) / gcd(m, n));
    }

    static long counter(long a, long b, int n){
        if(a%n == 0)
            return ((b/n) - (a/n) + 1);
        else
            return ((b/n) - (a/n));
    }
}