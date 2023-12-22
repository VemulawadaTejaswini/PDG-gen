import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
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
			int	h = in.nextInt();
			SW[]	sw = new SW[n];
			for (int i = 0; i < n; ++i)
			{
				sw[i] = new SW();
				sw[i].a = in.nextInt();
				sw[i].b = in.nextInt();
			}

			Arrays.sort(sw, new Comparator<SW>(){
				@Override
				public int compare(SW s0, SW s1)
				{
					return s1.b - s0.b;
				}});

			int	maxA = sw[0].a;
			for (int i = 0; i < n; ++i)
			{
				if (sw[i].a > maxA)
				{
					maxA = sw[i].a;
				}
			}

			int	attack = 0;
			int	useB;
			for (useB = 0; useB < n; ++useB)
			{
				if (sw[useB].b < maxA)
				{
					break;
				}
				h -= sw[useB].b;
				++attack;
			}

			int	aAttack = (h + maxA - 1) / maxA;

			System.out.println(attack + aAttack);
		}
	}


	public static class	SW
	{
		public int a;
		public int b;
	}
}