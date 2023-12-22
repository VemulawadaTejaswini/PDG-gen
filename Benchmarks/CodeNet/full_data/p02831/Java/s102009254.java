import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		String[] S = W.split(" ");
		int A = Integer.parseInt(S[0]);
		int B = Integer.parseInt(S[1]);

		double dAdivB = (A*1.0)/B;
		double dBdivA = (B*1.0)/A;
		int iAdivB = (A)/B;
		int iBdivA = (B)/A;

		long ans = 0;
		if(dAdivB-iAdivB == 0){
			if(A < B ){
				ans = B;
			}else{
				ans = A;
			}
		}else if(dBdivA - iBdivA == 0){
			if(A < B ){
				ans = B;
			}else{
				ans = A;
			}
		}else{
			ans = A*B;
		}


		System.out.println(ans);



	}


}
