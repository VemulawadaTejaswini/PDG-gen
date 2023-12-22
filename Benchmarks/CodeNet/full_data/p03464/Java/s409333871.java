import java.io.IOException;
import java.io.InputStream;
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

			if (n == 1)
			{
				if (a[0] == 2)
				{
					System.out.println("2 3");
				}
				else
				{
					System.out.println(-1);
				}
				return;
			}

			int	min = a[n - 2];
			int	max = min * 2 - 1;


			for (int i = a.length - 3; i >= 0; --i)
			{
				int	current = a[i];
				int	next = a[i + 1];

				int	pow = (max / current) * current;
				int	minCond = pow;
				int	maxCond = minCond + current - 1;

				while (minCond - current >= min)
				{
					minCond -= current;
				}

				if (minCond < min)
				{
					System.out.println(-1);
					return;
				}

				min = minCond;
				max = Integer.max(maxCond, max);
			}

			System.out.println(min + " " + max);
		}
	}

}
