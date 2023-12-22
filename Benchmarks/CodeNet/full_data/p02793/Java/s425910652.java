import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<BigInteger> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            BigInteger x = input.nextBigInteger();
            arr.add(x);
        }
        BigInteger LCM = arr.get(0), ans = BigInteger.ZERO, MOD = BigInteger.valueOf(1000000007);
        for (int i = 1; i < n; i++) {
            LCM = lcm(LCM, arr.get(i));
        }
        for (int i = 0; i < n; i++) {
            //System.out.println("sum is : "+ans);
            ans = ans.add(LCM.divide(arr.get(i)));
            ans = ans.mod(MOD);
        }

        System.out.print(ans);
    }

    static BigInteger gcd(BigInteger a, BigInteger b) {
        return a.gcd(b);
    }

    static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(gcd(a, b));
    }

}
