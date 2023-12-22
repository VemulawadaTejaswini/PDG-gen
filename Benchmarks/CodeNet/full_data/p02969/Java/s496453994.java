import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String N = in.readLine();

		int r = Integer.parseInt(N);

		System.out.println(3*(long)Math.pow(r, 2));
	}
}
