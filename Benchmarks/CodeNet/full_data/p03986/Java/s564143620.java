import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String X = in.next();
		in.close();
		boolean isChanged = true;
		X = "x" + X + "x";
		int length = X.length();
		while (isChanged)
		{
			isChanged = false;
			for (int i = 1; i + 1 < length; i++)
			{
				if (X.charAt(i) == 'S' && X.charAt(i + 1) == 'T')
				{
					//					System.out.print(X + " -> ");
					X = X.substring(0, i) + X.substring(i + 2, length);
					//					System.out.println(X);
					length -= 2;
					isChanged = true;
					break;
				}
			}
		}
		//		System.out.println(X);
		System.out.println(X.length() - 2);
	}
}
