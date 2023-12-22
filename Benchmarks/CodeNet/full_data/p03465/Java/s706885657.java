import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main
{
	public static void main(String[] args) throws Exception
	{
		invoke(System.in);
	}

	public static void	invoke(InputStream is) throws IOException
	{
		try (Scanner in = new Scanner(is))
		{
			int n = in.nextInt();
			int[]	a = new int[n];
			for (int i = 0; i < n; ++i)
			{
				a[i] = in.nextInt();
			}

			List<Long>	sumList = new ArrayList<Long>();

			for (int i = 1; i <= n; ++i)
			{
				int[][]	comb = enumerateCombination(n, i);
				for (int j = 0; j < comb.length; ++j)
				{
					long	sum = 0;
					for (int k = 0; k < i; ++k)
					{
						sum += a[comb[j][k]];
					}
					sumList.add(sum);
				}
			}

			sumList.sort(new Comparator<Long>(){
				@Override
				public int compare(Long a0, Long a1)
				{
					return (int)(a0 - a1);
				}});

			long	result = sumList.get(sumList.size() / 2);
			System.out.println(result);
		}
	}

	private static int	_pos;

	public static int	combination(int n, int k)
	{
		// 式
//		return	permutation(n, k) / factorial(n);

		// 漸化式 (オーバーフローしにくい)
		k = Integer.min(k, n - k);
		int	sum = 1;
		for (int i = 1; i <= k; ++i)
		{
			sum = sum * (n - i + 1) / i;
		}
		return	sum;
	}

	public static int[][]	enumerateCombination(int n, int k)
	{
		_pos = 0;

		int[][]	result = new int[combination(n, k)][k];

		int[]	currentResult = new int[k];
		enumerateCombinationRcsv(n, k, 0, currentResult, result);

		return	result;
	}

	public static void enumerateCombinationRcsv(int n, int k, int level, int[] currentResult, int[][] result)
	{
		if (level == k)
		{
			System.arraycopy(currentResult, 0, result[_pos++], 0, k);
			return;
		}

		int	startI = ((level == 0) ? 0 : currentResult[level - 1] + 1);
		for (int i = startI; i < n; ++i)
		{
			currentResult[level] = i;
			enumerateCombinationRcsv(n, k, level + 1, currentResult, result);
		}
	}
}