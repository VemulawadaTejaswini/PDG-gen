import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		String[] Ws = W.split(" ");
		long[] A = new long[Ws.length];
		for (int i = 0; i < Ws.length; i++) {
			A[i] = Long.parseLong(Ws[i]);
		}
		long ans = 0;
		long sum = A[1]+A[2];
		long div = A[0] / sum;
		long mod = A[0] % sum;
		ans = div * A[1] + Math.min(mod, A[1]);

		System.out.println(ans);
	}


}
