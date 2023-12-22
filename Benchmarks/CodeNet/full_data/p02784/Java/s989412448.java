import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int H = Integer.parseInt(Ws[0]);
		int N = Integer.parseInt(Ws[1]);

		W = in.readLine();
		Ws = W.split(" ");

		long[] A = new long[Ws.length];
		long sum=0;
		for (int i = 0; i < Ws.length; i++) {
			A[i] = Long.parseLong(Ws[i]);
			sum+=A[i];
		}

		System.out.println(H-sum<=0?"Yes":"No");
	}
}
