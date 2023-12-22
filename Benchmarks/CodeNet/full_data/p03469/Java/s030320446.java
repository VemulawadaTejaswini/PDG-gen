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
			String	s = in.next();
			System.out.println("2018" + s.substring(4));
		}
	}
}