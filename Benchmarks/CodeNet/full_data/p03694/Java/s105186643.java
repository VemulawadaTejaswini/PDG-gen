import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * クリスマスもあと半年となり、トナカイのAtCoDeer君はプレゼントを配る計画を立てることにしました。
 * TopCoDeer通りには N 個の家が並んでいます。i 個目の家は座標 a_i にあります。彼はこのすべての家にプレゼントを配ることにしました。
 * 好きな場所から開始し好きな場所で終了することができる時、最小の移動距離を求めなさい。
 */

public class Main {
	public static void main(String[] args) throws IOException{
		// input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] anArray = new int[n];
		String[] s = br.readLine().split(" ");
		for (int i = 0; i < n; i++){
			anArray[i] = Integer.parseInt(s[i]);
		}

		Arrays.sort(anArray);
		System.out.println(anArray[n-1]-anArray[0]);
	}

}