import java.util.Scanner;

public class Main
{
	static long n;
	static int nDigit;
	static int[] nums = { 3, 5, 7 };

	static int memo[][] = new int[30][1000000];

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		nDigit = String.valueOf(n).length();

		for(int i = 0; i < memo.length; ++i)
		{
			for(int j = 0; j < memo[0].length; ++j)
			{
				memo[i][j] = -1;
			}
		}

		/*
		System.out.println(n);
		System.out.println(nDigit);
		*/
		System.out.println(solve(0, 0, 0, 0));
	}

	private static int solve(long num, int digit, int stat, int bits)
	{
		if(memo[digit][stat] != -1)
		{
			return memo[digit][stat];
		}

		int ret = 0;
		for(int i = 0; i < 3; ++i)
		{
			long nextNum = num * 10 + nums[i];
			int nextBits = bits | (1 << i);

			if(nextNum <= n)
			{
				ret += solve(nextNum, digit + 1, stat * 3 + i, nextBits);
				if(nextBits == 7) {
					++ret;
				}
			}
		}

		return memo[digit][stat] = ret;
	}
}