import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		long H = Long.parseLong(W);;

		long X=H;
		long n=1;
		while(X!=1){
			X=X/2;

			n++;
		}
		System.out.println((long)Math.pow(2,n)-1);
	}
}
