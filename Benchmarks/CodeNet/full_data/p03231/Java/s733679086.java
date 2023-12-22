import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        String s=sc.next();
        String t=sc.next();
        long g=gcd(n,m);
        long lcm=n*m/g;
        for (long i = 0; i < g; i++) {
            if(s.charAt(i*n/g)!=t.charAt(i*m/g)){
                out.println(-1);
                exit(0);
            }
        }
        out.println(lcm);
    }
    static long gcd(long a,long b){
        long temp;
        while((temp=a%b)!=0){
            a=b;
            b=temp;
        }
        return b;
    }
}
