import java.util.*;

public class Main{
    static long gcd(long a, long b){
        long p = Math.max(a, b);
        long q = Math.min(a, b);
        long r = p % q;
        while(r!=0){
            p = q;
            q = r;
            r = p % q;
        }
        return q;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        String s = sc.next();
        String t = sc.next();
        long gcd = gcd(n, m);
        long lcm = m / gcd * n;
        long a = n / gcd;
        long b = m / gcd;
        boolean flag = true;
        for(int i = 0; i < gcd; i++){
            int index1 = (int)(i * a);
            int index2 = (int)(i * b);
            if(s.charAt(index1) != t.charAt(index2)){
                flag = false;
                break;
            }
        }
        System.out.println(flag ? lcm : -1);
    }
}