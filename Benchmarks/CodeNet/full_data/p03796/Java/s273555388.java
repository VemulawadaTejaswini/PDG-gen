import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int strN = 1; // 文字列を何行受け取るか
		for (int i = 0; i < strN; i++) {
			line += br.readLine() + " ";
		}
		String[] param = line.split(" ");

		Power(param);
	}

	static void Power(String[] param){
		
		int n = Integer.parseInt(param[0]);
		long a = 1;
		long b = (long) Math.pow(10, 9) + 7;
		
		for(int i = 1; i <= n; i++){
			a = i * a % b;
		}
		System.out.println(a);
	}

}