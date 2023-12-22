import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String W = in.readLine();
		String[] Ws = W.split(" ");
		int[] Wi = {Integer.parseInt(Ws[0]),Integer.parseInt(Ws[1])};


		int coin =0;
			for(int i=0;i<2;i++){
			if(Wi[0]<=Wi[1]){
				coin += Wi[1];
				Wi[1]--;
			}else{
				coin += Wi[0];
				Wi[0]--;
			}
		}

		System.out.print(coin);

	}


}
