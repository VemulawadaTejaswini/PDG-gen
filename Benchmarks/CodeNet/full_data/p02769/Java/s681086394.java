import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	static long MOD = 1000000007;
	static long[] inv = new long[200001];
	static long[] fact = new long[200001];
	static long[] factinv = new long[200001];
	
	static long nCk(int n, int k)
	{
		return (((fact[n]*factinv[n-k])%MOD)*factinv[k])%MOD;
	}
	
	static long binpow(long a, long b, long m)
	{
		a = a%m;
		long res = 1;
		while(b>0)
		{
			if((b & 1) != 0)
				res = (res*a)%m;
			a = (a*a)%m;
			b >>= 1;
		}
		res=res%MOD;while(res<0)res+=MOD;
		return res;
	}
	
	static long ainb(int a, int b)
	{
//		System.out.println(a + " in " + b);
		long sum = 0;
		if(a <= b)
			for(int i = 1; i <= a; i++)
			{
//				System.out.println("from " + nCk(b,i) + " " + nCk(a-1,i-1));
				sum = (sum + (nCk(b,i)*nCk(a-1,i-1))%MOD)%MOD;
			}
		else if(a>b)
		{
			for(int k = 0; k < b; k++)
			{
				sum = (sum + nCk(a, k))%MOD;
			}
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		//calculate inverse using binary exponentiation
		fact[0] = 1;
		factinv[0] = 1;
		for(int i = 1; i <= 200000; i++)
		{
			inv[i] = (binpow(i,MOD-2,MOD));
			fact[i] = (fact[i-1] * i)%MOD;
			factinv[i] = (inv[i] * factinv[i-1])%MOD;
		}
		
		
		long tes = 1;
		for(int i = 0; i < 3; i++)
		{
			tes = (tes*2)%MOD;
		}
//		System.out.println("test " + tes);
//		System.out.println("test2 " + (ainb(5,2)));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long q = 0;
		
		int free = Math.min(n, k); //max zeroes
		int rest = n - free;
		q = (ainb(n,n))%MOD;
//		System.out.println("starts with " + q);
		
		for(int i = free+1; i < n; i++)
		{
//			System.out.println("Can't have " + i + " zeroes");
			int nonzero = n-i;
//			System.out.println("Deduct those with " + nonzero + " terms");
//			long cur = ainb(n,nonzero);
			long cur = nCk(n-1,nonzero-1);
//			System.out.println("of which there are " + cur + " unshuffled");
			cur = (cur * nCk(n,nonzero))%MOD;
//			System.out.println("Shuffle times " + (i+1) + " becomes " + cur);
			
			q = (q-cur)%MOD;
			while(q<0)q+=MOD;
		}
		System.out.println(q);
	}

}
