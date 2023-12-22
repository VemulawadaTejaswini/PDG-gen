import java.util.*;
import java.math.BigInteger;

public class Main {
    static BigInteger fact[] = new BigInteger[51];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        boolean isEven = P % 2 == 0;
        int numEven = 0, numOdd = 0;
        int A[] = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            if (A[i] % 2 == 0) { numEven++; } else {numOdd++;}
        }
        //System.out.println("even, odd=" + numEven + "  "+ numOdd);

        fact[0] = new BigInteger("1");
        for (int i=1; i<=50; i++) {
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i));
        }
        
        long ans = 0;
        for (int i=0; i<=N; i++) {
            for (int j=0; j<=i; j++) {
                if (j > numOdd || i-j > numEven) { continue; }
                long count = comb(numOdd, j) * comb(numEven, i-j);
                if (j % 2 != 0 ^ isEven) {
                    ans += count;
                }
                //System.out.println("i, j" + i + ", " + j + " = " + ans);
            }
        }
        System.out.println(ans);
    }

    public static long comb(int n, int k) {
        long retVal = fact[n].divide(fact[k].multiply(fact[n-k])).longValue();
        //System.out.println("comb" + n + ", " + k + " = " + retVal);
        return retVal;
    }
}
