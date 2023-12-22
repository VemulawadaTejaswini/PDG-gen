import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger N = sc.nextBigInteger();
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger modulo = A.add(B);
        BigInteger mod = N.divide(modulo);
        BigInteger ans = mod.multiply(A);
        BigInteger remain = N.subtract(modulo.multiply(mod));
        if(remain.compareTo(A) > 0 && A.compareTo(BigInteger.ZERO) > 0){
            ans = ans.add(A);
        } else{
            ans = ans.add(remain);
        }
        System.out.println(ans);
        sc.close();
    }
}
