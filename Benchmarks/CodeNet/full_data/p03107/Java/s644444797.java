import java.util.*;

public class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);

		String str = sc.nextLine();
		int n = str.length();

		boolean pos = true;
		while (pos)
		{
			boolean tempPos = false;
			for (int i = 0; i < str.length()-1; i++)
			{
				if (!(  (str.substring (i,i+1)).equals(str.substring (i+1,i+2))  ))
				{
					tempPos = true;
					str = (str.substring (0,i)) + (str.substring ((i+2),str.length()));
				}
			}
			if (tempPos == false)
				pos = false;
			else
				pos = true;
		}

		System.out.println (n-str.length());



	}
}