import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);

		W = in.readLine();
		String[] ws = W.split(" ");
		long[] H = new long[ws.length];
		String ans = "Yes";
		for(int i=0;i<ws.length;i++){
			H[i]=Long.parseLong(ws[i]);
			if(i==0){

			}else if(i==1){
				if(H[i-1] >= H[i]){
					H[i-1] = H[i-1]-1;
				}
			}else{
				if(H[i-1] >= H[i]){
					if(H[i-2] < H[i-1]){
						H[i-1]=H[i-1]-1;
					}
				}
			}
			if(i!=0 && H[i-1] > H[i]){
				ans="No";
				break;
			}
		}

		System.out.println(ans);

	}

}
