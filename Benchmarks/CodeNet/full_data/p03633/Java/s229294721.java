import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] t = new long[n];
        long ans = 1;
        for(int i = 0; i < n; i++)
            ans = lcm(ans, sc.nextLong());
        System.out.print(ans);
    }
    static long lcm(long a, long b){
        return a / gcd(a, b) * b;
    }
    static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}