import java.util.Scanner;
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(new BufferedInputStream(System.in));
		
		int h = cin.nextInt();
		int w = cin.nextInt();
		int a = cin.nextInt();
		int b = cin.nextInt();
		
		BigInteger h1 = BigInteger.valueOf(h);
		BigInteger w2 = BigInteger.valueOf(w);
		BigInteger a2 = BigInteger.valueOf(a);
		BigInteger b2 = BigInteger.valueOf(b);
		
		BigInteger[] dp = new BigInteger[100005];
		for(int i = 0; i < w; i ++)	dp[i] = BigInteger.valueOf(1);
		for(int i = 1; i < h - a; i ++)
		{
			for(int j = 1; j < w; j ++)	dp[j] = dp[j].add(dp[j - 1]);
		}
		for(int i = h - a; i < h; i ++)
		{
			for(int j = b + 1; j < w; j ++)	dp[j] = dp[j].add(dp[j - 1]);
		}
		System.out.println(dp[w - 1].mod(BigInteger.valueOf(1000000007)));
	}
}