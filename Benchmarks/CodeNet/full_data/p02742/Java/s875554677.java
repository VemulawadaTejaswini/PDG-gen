import java.math.BigInteger;
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int w1 = sc.nextInt();
        BigInteger h = BigInteger.valueOf(h1);
        BigInteger w = BigInteger.valueOf(w1);
        BigInteger ans = BigInteger.valueOf(0);

        if(h.remainder(BigInteger.valueOf(2)) != BigInteger.valueOf(0)){
            ans = ((h.subtract(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2))).multiply(w);
            if(w.remainder(BigInteger.valueOf(2)) != BigInteger.valueOf(0)){
                ans = ans.add(((w.subtract(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2))).add(BigInteger.valueOf(1)));
            }
            else{
                ans = ans.add(w.divide(BigInteger.valueOf(2)));
            }
        }
        else{
            ans = w.multiply(h.divide(BigInteger.valueOf(2)));
        }
        System.out.println(ans);
    }
}