import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] x = new long[n];
		long[] y = new long[m];
		for(int i = 0; i < n; i++)
			x[i] = sc.nextLong();
		for(int i = 0; i < m; i++)
			y[i] = sc.nextLong();
		
		BigInteger sum1 = BigInteger.valueOf(0);
		BigInteger sum2 = BigInteger.valueOf(0);
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				sum1 = sum1.add(BigInteger.valueOf(x[j] - x[i]));
			}
		}
		for(int i = 0; i < m - 1; i++){
			for(int j = i + 1; j < m; j++){
				sum2 = sum2.add(BigInteger.valueOf(y[j] - y[i]));
			}
		}
		
		BigInteger result = sum1.multiply(sum2).remainder(BigInteger.valueOf(1000000007));
		System.out.println(result);
		sc.close();
	}
}
