import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		for(int i=1;i<=k;i++) {
			System.out.println(((long)nCk(n-k+1,i,1000000007)*(long)nCk(k-1,i-1,1000000007))%1000000007);
		}
		
		in.close();

	}
	
	//return a^b mod M O(logB)
	public static long pow(long a,long b,int M) {
		long ret = 1;
		long tmp = a;
		while(b>0) {
			if((b&1)==1) ret = (ret * tmp) % M;
			tmp = (tmp * tmp) % M;
			b = b>>1;
		}
		return ret;
	}
	
	//return nCk mod M (M must be prime number) O(min(k,n-k)*logM)
	public static int nCk(int n,int k,int M) {
		long ret = 1;
		int min = Math.min(k, n-k);
		for(int i=1;i<=min;i++) {
			ret = (ret * pow(i,M-2,M)) % M;
		}
		for(int i=n-min+1;i<=n;i++) {
			ret = (ret * i) % M;
		}
		return (int)ret;
	}

}
