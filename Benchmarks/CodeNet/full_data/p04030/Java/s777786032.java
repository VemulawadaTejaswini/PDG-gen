import java.util.Scanner;
public class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = "";

		for (int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if (c=='0')
				ans = ans+'0';
			else if (c=='1')
				ans = ans+'1';
			else if (c=='B')
			{
				if (str.length()==0)
					continue;
				else
					str = str.substring(0,str.length());
			}
		}

		System.out.print(res);
	}
}