import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		long A = Long.parseLong(Ws[0]);
		long B = Long.parseLong(Ws[1]);
		long K = A+B;

		if(K%2 == 1){
			System.out.println("IMPOSSIBLE ");
		}else{
			System.out.println(K/2);
		}




	}

}
