import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static long[][] A ;
	static int N;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		N = Integer.parseInt(W);


		A = new long[2][N];

		for(int k=0;k<2;k++){
			W = in.readLine();
			String[] Ws = W.split(" ");

			for (int i = 0; i < Ws.length; i++) {

				A[k][i] = Long.parseLong(Ws[i]);
			}
		}

		System.out.println(calc(0,0,0));

	}

	public static long calc(int i,int j,long sum){
		if(i==1 && j==N-1){
			return sum+A[i][j];
		}
		if(i==1){
			return calc(i,j+1,sum+A[i][j]);
		}else if(j==N-1){
			return calc(i+1,j,sum+A[i][j]);
		}else{
			return Math.max(calc(i+1,j,sum+A[i][j]), calc(i,j+1,sum+A[i][j]));
		}
	}

}
