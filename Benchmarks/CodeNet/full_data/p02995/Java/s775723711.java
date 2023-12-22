import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        
        long B = sc.nextLong();
        
        long C = sc.nextLong();
        
        long D = sc.nextLong();

        long a = 0;

        long m = 0, n = 0, mn = 0;

            m = B/C-(A-1)/C;
            n = B/D-(A-1)/D;
            mn = B/lcm(C,D)-(A-1)/lcm(C,D);
            
            a = (B-A+1)-(m+n-mn);

        System.out.println(a);
        
    }

    //最小公倍数lcm・コピペ
    static long lcm (long a, long b) {
	    long temp;
        long c = a;
        
	    c *= b;
        
        while((temp = a%b)!=0) {
		    a = b;
		    b = temp;
	    }
	    return (c/b);
    }

}