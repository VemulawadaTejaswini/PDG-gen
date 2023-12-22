import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int len = (int)lcm((long)s.length,(long)t.length);
        char[] ans = new char[len];
        Arrays.fill(ans, '0');
        int spow = len/n;
        for(int i = 0; i < s.length; i++){
            ans[spow*i] = s[i];
        }
        int tpow = (int)(len/m);
        for(int i = 0; i < t.length; i++){
            if(ans[tpow*i] != '0' && ans[tpow*i] != t[i]){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(len);
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