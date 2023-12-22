import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = sc.nextLong();
        for(int i = 1; i < n; i++){
            ans = lcm(ans,sc.nextLong());
        }
        System.out.println(ans);
    }
    
    private static long gcd(long a, long b){
        while (b > 0)
        {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static long lcm(long a, long b){
        return a * (b / gcd(a, b));
    }
}