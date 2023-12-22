import java.util.*;

public class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		int n = str.length();

		//0=red	1=blue

			for (int i = 0; i < str.length()-1; i++)
			{
				if (!(  (str.substring (i,i+1)).equals(str.substring (i+1,i+2))  ))
				{
					str = (str.substring (0,i)) + (str.substring ((i+2),str.length()));
					i = -1;
				}
			}


		System.out.println (n-str.length());
	}
}