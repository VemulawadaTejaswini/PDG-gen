import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int X = Integer.parseInt(W);





		int ans = 0;

		int hand = (int)X/100;
		if(hand == 0){
			ans = 0;
		}else{
			if(hand*5 < Integer.valueOf(W.substring(W.length()-2))){
				ans = 0;
			}else{
				ans = 1;
			}
		}

		System.out.println(ans);



	}


}
