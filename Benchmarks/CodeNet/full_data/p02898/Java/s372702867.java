
import java.util.*;
import java.text.*;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		// # of friends
		int a = sc.nextInt();
		// min height
		int b = sc.nextInt();


		for(int i = 1; i <= a ; i++)
		{
			// height in cm.
			int c = sc.nextInt();
				if(c >= b)
				{
					counter++;

				}
		}
		System.out.println(counter);
	}
}