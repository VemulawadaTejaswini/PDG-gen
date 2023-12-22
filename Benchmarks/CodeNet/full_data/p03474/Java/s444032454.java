import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Main
{
	public static void main(String[] args) throws Exception
	{
		invoke(System.in);
	}

	public static void	invoke(InputStream is) throws IOException
	{
		// input
		BufferedReader	reader = new BufferedReader(new InputStreamReader(is));
		String	line = reader.readLine();
		String[]	va = line.split(" ");
		int a = Integer.parseInt(va[0]);
		int b = Integer.parseInt(va[1]);

		line = reader.readLine();
		char[]	ca = line.toCharArray();

		try
		{
			int	i;
			for (i = 0; i < a; ++i)
			{
				if ('0' <= ca[i] && ca[i] <= '9')
				{

				}
				else
				{
					System.out.println("No");
					return;
				}
			}

			if (ca[i++] != '-')
			{
				System.out.println("No");
				return;
			}

			for (int j = 0; j < b; ++i, ++j)
			{
				if ('0' <= ca[i] && ca[i] <= '9')
				{

				}
				else
				{
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}
		catch (Exception e)
		{
			System.out.println("No");
		}
	}

}