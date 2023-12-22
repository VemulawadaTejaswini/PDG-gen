package vjudge;

import java.math.BigInteger; 
import java.util.Scanner;

class Vjudge {

    
    public static void main(String[] args) {
        int one = 1;
        BigInteger a;
        BigInteger b;
        BigInteger r;
        int d;
        Scanner input;
        input = new Scanner(System.in);
        a = input.nextBigInteger();
        b = input.nextBigInteger();
        d = input.nextInt();
        BigInteger c = b.subtract(a);
        BigInteger s = c.add(BigInteger.valueOf(one));
        r = s.divide(BigInteger.valueOf(d));
        
        System.out.println(r);
    }
    
}