import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

class Main {
    static final long limit = 1000000000;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger S = new BigInteger(sc.next());
        BigInteger[] sov = S.divideAndRemainder(BigInteger.valueOf(1000000000));
        System.out.println("0 0 1000000000 1 "+sov[0]+" "+sov[1]);
    }
}