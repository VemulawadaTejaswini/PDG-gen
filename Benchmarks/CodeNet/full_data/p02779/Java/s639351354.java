import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		W = in.readLine();
		String[] Ws = W.split(" ");

		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i] = Integer.parseInt(Ws[i]);
		}
		Arrays.sort(A);

		String ans = "Yes";
		for(int i=1;i<N;i++){
			if(A[i-1]==A[i]){
				ans = "No";
				break;
			}
		}

		System.out.println(ans);

	}


}
