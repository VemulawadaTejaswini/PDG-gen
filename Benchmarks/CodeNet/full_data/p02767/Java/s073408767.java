import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int N = Integer.parseInt(Ws[0]);

		W = in.readLine();
		Ws = W.split(" ");
		int[] X = new int[N];
		for(int i=0;i<N;i++){
			X[i] = Integer.parseInt(Ws[i]);
		}

		Arrays.sort(X);

		long ans = Long.MAX_VALUE;

		long st = X[0];
		long ed = X[X.length-1];
		for(long i=st;i<=ed;i++){
			long tmp=0;
			for(int k=0;k<N;k++){
				tmp+=Math.pow(X[k]-i, 2);
			}
			ans = Math.min(ans, tmp);
		}

		System.out.println(ans);

	}

}
