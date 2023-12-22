import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		W=in.readLine();
		String[] sW = W.split(" ");
		int[] t = new int[N];
		long sum = 0;
		for(int i=0;i<N;i++){
			t[i]=Integer.parseInt(sW[i]);
			sum=t[i];
		}

		W=in.readLine();
		int M = Integer.parseInt(W);

		int p1,p2;
		for(int i=0;i<M;i++){
			W=in.readLine();
			sW = W.split(" ");
			p1=Integer.parseInt(sW[0]);
			p2=Integer.parseInt(sW[1]);
			System.out.println(sum - (t[p1]-p2));
		}
	}




}
