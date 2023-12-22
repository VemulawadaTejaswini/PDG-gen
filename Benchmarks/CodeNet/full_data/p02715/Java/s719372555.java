import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	final long MOD=(long)1e9+7;
	
	long pow(long a,long n,long p) {
		long ret=1;
		for (;n>0;n>>=1,a=a*a%p) if(n%2==1) ret=ret*a%p;
		return ret;
	}
	
	long gcd(long a,long b) {
		return a==0?b:gcd(a,b);
	}
	

	void run() {
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		boolean[] isPrime=new boolean[(int)1e5+10];
		boolean[] isQrime=new boolean[(int)1e5+10];
		int[] cnt=new int[(int)1e5+10];
		Arrays.fill(isPrime, true);Arrays.fill(isQrime, true);;
		isPrime[0]=isPrime[1]=isQrime[0]=isQrime[1]=false;
		ArrayList<Integer> qrime=new ArrayList<>();
		qrime.add(1);
		for (int i=2;i<isPrime.length;++i) {
			if (isQrime[i]) qrime.add(i);
			if (!isPrime[i]) continue;
			for (int j=2*i;j<isPrime.length;j+=i) isPrime[j]=false;
			for (int j=1*i;j<isPrime.length;j+=i) ++cnt[j];
			for (long j=(long)i*i;j<isQrime.length;j+=i*i) isQrime[(int)j]=false;
		}
		long N=sc.nextLong();
		long K=sc.nextLong();
		long ans=0;
		for (long gcd=1;gcd<=K;++gcd) {
			for (int q:qrime) {
				if (K<gcd*q) break;
				ans+=pow(K/(gcd*q),N,MOD)*(cnt[q]%2==0?1:MOD-1)%MOD*gcd%MOD;
				ans%=MOD;
			}
		}
		pw.println(ans);
		pw.close();
	} 
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
	
    public static void main(String[] args) {
    	new Main().run();
    }
}
