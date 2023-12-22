import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
		}
		BigInteger b = BigInteger.ONE;
		for(int i = 0 ; i < N ; ++i){
			BigInteger ai = BigInteger.valueOf(A[i]);
			BigInteger g = ai.gcd(b);
			b = ai.multiply(b).divide(g);
		}
		BigInteger ret = BigInteger.ZERO;
		for(int i = 0 ; i < N ; ++i){
			BigInteger bi = b.divide(BigInteger.valueOf(A[i]));
			ret = ret.add(bi);
		}
		ret = ret.mod(BigInteger.valueOf(1000000007));
		System.out.println(ret);
	}
}
