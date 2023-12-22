import java.util.Scanner;

public class Main {
	static long mod = (long)1e9+7;
	public static long fact(long x) {
		long ret=1;
		for(int i=1; i<=x; i++)
			ret = ret*i%mod;
		return ret;
	}

	public static long count(long n, long m) {
		if(n-m>1||m-n>1)
			return 0;
		long tmp = fact(n)*fact(m)%mod;
		if(n==m) return 2*tmp%mod;
		else return tmp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		sc.close();

		System.out.println(count(n, m));
	}
}
