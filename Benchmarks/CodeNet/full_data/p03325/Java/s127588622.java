import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		String[] Ws = W.split(" ");
		long N = Long.parseLong(Ws[0]);

		W = in.readLine();
		Ws = W.split(" ");
		long[] a = new long[Ws.length];
		long even = 0;
		for (int i = 0; i < Ws.length; i++) {
			a[i] = Long.parseLong(Ws[i]);
			if(a[i]%2==0){
				long k=a[i];
				while(k%2==0){
					k=k/2;
					even++;
				}
			}
		}

		System.out.println(even);
	}
}
