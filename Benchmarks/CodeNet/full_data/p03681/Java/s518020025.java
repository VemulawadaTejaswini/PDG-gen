import java.util.Scanner;

// Java8
public class Main
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}
	
	final long MOD = 1000000007;
	
	void run()
	{
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(Math.abs(n - m)>1)
		{
			System.out.println(0);
			return;
		}
		long fn = factMod(n);
		long fm = factMod(m);
		long res = (fn * fm) % MOD;
		if(n==m) res = (res * 2) % MOD;
		System.out.println(res);
	}
	
	long factMod(int n)
	{
		long res = 1;
		for(int i=1; i<=n; i++)
		{
			res *= i;
			res %= MOD;
		}
		return (int)res;
	}
}
