import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);
		long[] A = new long[N];
		W = in.readLine();
		String[] Ws = W.split(" ");
		for(int i = 0;i<N;i++){
			A[i] = Long.parseLong(Ws[i]);
		}

		long ans =0;
		final long mod = 1000000007;
		for(int i=0;i<N-1;i++){
			for(int k=i+1;k<N;k++){
				ans = (ans+ (A[i]^A[k]))%mod;
			}
		}

		System.out.println(ans);

	}


}
