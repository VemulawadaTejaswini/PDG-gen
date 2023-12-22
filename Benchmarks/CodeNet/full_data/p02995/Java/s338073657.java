import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        long lcm = C * D / gcd(Math.max(C, D), Math.min(C, D));
        long c = B / C - (A - 1) / C;
        long d = B / D - (A - 1) / D;
        long e = B / lcm - (A - 1) / lcm;
        long ans = B - A + 1 - c - d + e; 
        System.out.println(ans);
    }
    public static long gcd(long max, long min){
        if(max%min==0){
            return min;
        }
        min = gcd(min, max % min);
        return min;
    }
}