import java.util.*;
import java.lang.*;

class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        sc.close();
        long ans = 0;
        long g = (C*D) / gcd(C,D);
       // System.out.println(g);
        ans += ((B/C) - ((A-1)/C));        
       // System.out.println(ans);
        ans += ((B/D) - ((A-1)/D));
       // System.out.println(ans);
        ans -= ((B/g) - ((A-1)/g));

        System.out.println((B-A+1) - ans);

    }
    static long gcd (long a, long b){
        long temp;
        while((temp = a%b) != 0){
            a = b;
            b = temp;
        }
        return b;
    }
}
