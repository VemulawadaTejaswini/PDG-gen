import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static Scanner s=new Scanner(System.in);

	static int mod=1000000007;
	
	static long nCr(int n,int r) {
		long res=1;
		for(int i=1;i<=r;++i) {
			res*=n-r+i;
			res/=i;
			res%=mod;
		}
		return res;
	}
	
	void solve(){
		int n=gInt();
		
		int[]a=new int[n];
		
		int fact[]=new int[n+1];
		fact[0]=1;
		for(int i=1;i<=n;++i) {
			fact[i]=(int)((long)i*fact[n-1]%mod);
		}
	}

	public static void main(String[] A){
		new Main().solve();
	}

	static int gInt(){
		return Integer.parseInt(s.next());
	}
	static long gLong(){
		return Long.parseLong(s.next());
	}
	static double gDouble(){
		return Double.parseDouble(s.next());
	}

	IntStream REP(int n){
		return REP(0,n-1);
	}
	IntStream REP(int l,int r){
		return IntStream.rangeClosed(l,r);
	}

	IntStream INTS(int n){
		return IntStream.generate(Main::gInt).limit(n);
	}
}
aaa