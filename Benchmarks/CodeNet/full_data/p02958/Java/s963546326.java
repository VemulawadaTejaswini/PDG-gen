import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);
		W = in.readLine();
		String[] Ws = W.split(" ");
		int[] P = new int[N];

		int count = 0;
		for(int i=0;i<N;i++){
			P[i] = Integer.parseInt(Ws[i]);
			if(i+1 != P[i])
				count++;
		}

		if(count > 3){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}



	}

}
