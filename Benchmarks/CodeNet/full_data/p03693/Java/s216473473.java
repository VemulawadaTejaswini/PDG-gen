import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		int a=reader.nextInt();
		int b=reader.nextInt();
		int c=reader.nextInt();
		if((100*a+10*b+c)%4==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}