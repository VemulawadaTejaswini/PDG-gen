
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	long n = sc.nextInt();
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int p = 1000000007;

    	long ans = (modPow(2,n,p)-1-modCombination(n,a,p)-modCombination(n,b,p))%p;
    	if(ans>=0) {
    		System.out.println(ans);
    	} else {
        	System.out.println(ans+p);
    	}


    }
    public static final long modPow(long x, long n, final long mod) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {      //ビットが立っていたら
                sum = sum * x % mod; //x^2^k1 * x^2^k2 * x^2^k3 * ・・・
            }
            x = x * x % mod;         //((x^2)^2)^2 ・・・
            n >>= 1;
        }
        return sum;
    }
    public static final long modCombination(long a, long b, final long mod) {
    	long P = 1;
    	for(long i=a;i>=a-b+1;i--) {
    		P = P*i%mod;
    	}
    	long F = 1;
    	for(long i=1;i<=b;i++) {
    		F = F*i%mod;
    	}

    	long modComb = P*modPow(F,mod-2,mod)%mod;
    	return modComb;
    }
}
