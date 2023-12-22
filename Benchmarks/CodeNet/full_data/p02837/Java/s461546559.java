import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W)+1;
		int[][] A = new int[N][N];
		for(int i=1;i<N;i++){
			Arrays.fill(A[i], -1);
		}
		for(int i=1;i<N;i++){
			W = in.readLine();
			int t = Integer.parseInt(W);
			for(int k=0;k<t;k++){
				W = in.readLine();
				String[] Ws = W.split(" ");
				A[i][Integer.parseInt(Ws[0])]= Integer.parseInt(Ws[1]);
			}
		}
		int ans = 0;
		for(int i=(int)Math.pow(2, N-1)-1;i>0;i--){

			String truth ="0"+String.format("%0"+(N-1)+"d",Integer.parseInt(Integer.toBinaryString(i)));
			char[] tmp = truth.toCharArray();
			int[] t = new int[tmp.length];

			for(int ti = 1;ti<t.length;ti++){
				t[ti] = (char)(tmp[ti]-'0');
			}
			boolean unmachFlg = false;
			for(int x=1;x<N;x++){
				for(int y=1;y<N;y++){
					if(t[y] == 1 && A[x][y] !=-1 && A[x][y] != t[x]){
						unmachFlg = true;
						break;
					}
				}
				if(unmachFlg){
					break;
				}
			}
			if(!unmachFlg){
				ans = Math.max(ans, Integer.bitCount(i));
			}
		}

		System.out.println(ans);


	}


}
