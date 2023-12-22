import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        long K = scan.nextInt();
        int a[] = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }

        long mother = 1000000007;
        int big, small;
        long answer = 0;

        BigInteger inv = new BigInteger(String.valueOf(2)).modInverse(BigInteger.valueOf(mother));
        int invOf2 = inv.intValue();

        for(int i = 0; i < N; i++) {
            small = 0;
            big = 0;
            int target = a[i];
            //smallの個数の計算
            for(int j = 0; j < i; j++) {
                if(target > a[j])
                    small++;
            }
            //bigの個数の計算
            for(int j = i+1; j < N; j++) {
                if(target > a[j])
                    big++;
            }
            
            answer += (((((big*(K+1)) % mother)*K) % mother) * invOf2  + ((((small*K)% mother)*(K-1)) % mother) * invOf2) % mother;
            answer = answer % mother;
        }
        os.println(answer);
    }
}