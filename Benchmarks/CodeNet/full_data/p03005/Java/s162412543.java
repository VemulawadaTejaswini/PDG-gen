import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String W = in.readLine();
		int N = Integer.parseInt(W.split(" ")[0]);
		int K = Integer.parseInt(W.split(" ")[1]);

		long ans = N-K;

		if(K==1){
			ans =0;
		}
		System.out.println(ans);
	}

}
