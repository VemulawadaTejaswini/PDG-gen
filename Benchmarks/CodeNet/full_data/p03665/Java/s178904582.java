import java.math.BigInteger;
import java.util.Scanner;

class Biscuits {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int Ec = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(num % 2 == 0)
                Ec++;
        }
        int Oc = N - Ec;
        BigInteger ans = BigInteger.ONE;
        if(P == 1) {
            BigInteger temp = new BigInteger("2").pow(Oc).divide(new BigInteger("2"));
            ans = ans.max(temp);
            if(Oc == 0)
                ans = BigInteger.ZERO;
            temp = ans.multiply(new BigInteger("2").pow(Ec));
            ans = ans.max(temp);
        }
        else {
            BigInteger temp = new BigInteger("2").pow(Oc).divide(new BigInteger("2"));
            ans = ans.max(temp);
            temp = ans.multiply(new BigInteger("2").pow(Ec));
            ans = ans.max(temp);
        }

        System.out.println(ans);
    }
}
