import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mod = 1000000007;
		String L = in.next();
		long ans = 1;
		ans += pow(3,L.length()-1,mod)-1;
		long num = 2;
		for(int i=1;i<L.length();i++) {
			if(L.charAt(i)=='0') continue;
			else {
				ans = (ans + (num*pow(3,L.length()-1-i,mod))%mod)%mod;
				num = (num*2)%mod;
			}
		}
		ans = (ans + num)%mod;
		System.out.println(ans);
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

}
