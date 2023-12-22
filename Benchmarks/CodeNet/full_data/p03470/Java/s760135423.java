import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
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
			int	n = in.nextInt();
			int[]	d = new int[n];
			for (int i = 0; i < d.length; ++i)
			{
				d[i] = in.nextInt();
			}

			Arrays.sort(d);
			int	cnt = 1;
			int	x = d[0];
			for (int i = 1; i < d.length; ++i)
			{
				if (d[i] != x)
				{
					x = d[i];
					++cnt;
				}
			}
			System.out.println(cnt);
		}
	}
}