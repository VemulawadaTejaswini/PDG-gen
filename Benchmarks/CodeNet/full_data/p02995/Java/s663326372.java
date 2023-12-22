/*https://atcoder.jp/contests/abc131/tasks/abc131_c*/

import java.util.*;
import java.awt.*;

class Main{
 
    private static Scanner sc = new Scanner(System.in);
    

    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
    public static long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public static long divi(long l,long a,long b){
        long res = l;
        res -= l/a;
        res -= l/b;
        res += l/lcm(a,b);
        return res;
    }
    public static void main(String[] args) {
        String s = sc.next();
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        long a = Long.parseLong(s); 
        long b = Long.parseLong(s1);
        long c = Long.parseLong(s2);
        long d = Long.parseLong(s3);
        //char[] code = s.toCharArray();
        long ans = divi(b,c,d)-divi(a-1,c,d);
        
        System.out.println(ans); }
}
