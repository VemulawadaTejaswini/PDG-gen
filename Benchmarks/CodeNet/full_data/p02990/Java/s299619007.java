import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static BufferedReader reader;
	final static long MOD = Long.parseLong(String.format("%.0f", (Math.pow(10, 9)+7)));
	static long[] fact = new long[2000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		String[] strings = readLine();
		int N = Integer.parseInt(strings[0]);
		int K = Integer.parseInt(strings[1]);
		final int CNT_AKA = N-K;
		final int CNT_AO = K;
		for(int i=1;i<=K;i++) {
			//akaのおきかた：i-1この0きんしぶんかつ+2このぶんかつ
			//aoのおきかた：iこの0きんしぶんかつ
			long cnt = (conb(CNT_AKA+1,i)*conb(CNT_AO-1,i-1))%MOD;//((cnt_aka+1) C (i+1))*((cnt_ao) C (i-1))
			print(cnt);
		}
	}
	
	private static long conb(int n, int k) {
		long r = 1;
		if(k>n-k) {k = n-k;}
		for(int i=0;i<k;i++) {
			r*=(n-i);
		}
		return r/fact(k);
	}
	
	private static long fact(int n) {
		if(fact[n]>0) {return fact[n];}
		if(n==0) {return 1;}
		return (fact[n]=fact(n-1)*n%MOD);
	}

	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
}
