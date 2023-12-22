import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		String[] Ws = W.split(" ");
		long N = Long.parseLong(Ws[0]);
		long K = Long.parseLong(Ws[1]);


		long ans = N%K;
		ans = Math.min(ans, Math.abs(K-ans));
		System.out.println(ans);

	}
}
