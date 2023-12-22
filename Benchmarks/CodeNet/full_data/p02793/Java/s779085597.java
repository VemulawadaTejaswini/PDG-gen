import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	static int[] arr;
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		String[] wrods = br.readLine().split(" ");
		arr = new int[wrods.length];
		BigInteger t = BigInteger.ONE;
		for (int i = 1; i <= N; i++) {
			arr[i - 1] = Integer.parseInt(wrods[i - 1]);
			BigInteger tmp = BigInteger.valueOf(arr[i-1]);
			BigInteger A = t.gcd(tmp);
			t = t.multiply( tmp ).divide(A);
		}
		long sum = 0;
		for(int i=0;i<N;i++) {
			BigInteger s  = t.divide(BigInteger.valueOf(arr[i])).mod(BigInteger.valueOf(1000000007));
			sum = (sum + s.longValue()) %1000000007;
		}
		System.out.println(sum);
	}
}