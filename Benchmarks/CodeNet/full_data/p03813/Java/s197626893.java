import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String input = "2";
		try {
			input = br.readLine();
		} catch (IOException e) {
		}

		long out = 0;
		long K = Long.valueOf(input);
		if (K == 1) {
			out = 1;
		} else if (2 < K && K <= 7) {
			out = 2;
		} else {
			long K1 = Long.valueOf(input) - 1;
			long M1 = Math.max(K1/11,-1) + 1;
			long L1 = Long.MIN_VALUE;
			L1 = M1 * 2 + 1;

			long K2 = Long.valueOf(input) - (1 + 5);
			long L2 = Long.MIN_VALUE;
			long M2 = Math.max(K2/11,-1) + 1;
			L2 = M2 * 2 + 2;

			long K3 = Long.valueOf(input) - (1 + 6);
			long M3 = Math.max(K3/11,-1) + 1;
			long L3 = M3 * 2 + 1;
			out = Math.min(Math.min(L1,  L2), L3);
		}
		System.out.print(out);
	}
}
