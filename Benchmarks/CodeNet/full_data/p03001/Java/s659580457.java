import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		long w =  Long.parseLong(W.split(" ")[0]);
		long h =  Long.parseLong(W.split(" ")[1]);
		long x =  Long.parseLong(W.split(" ")[2]);
		long y =  Long.parseLong(W.split(" ")[3]);

		double sq = w*h/2.0;
		System.out.print(sq+" ");

		if(w/2.0==x && h/2.0 == y){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}
}
