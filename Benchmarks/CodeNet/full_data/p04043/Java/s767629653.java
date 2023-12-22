import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
			int[] ABC = new int[3];
			int counter1 = 0;
			int counter2 = 0;
			for (int i = 0; i < 3; i++) 
			{
				ABC[i] = scan.nextInt();
			}
			for (int a: ABC)
			{
				if (a == 5)
				{
					counter1++;
				}
				if (a == 7)
				{
					counter2++;
				}
			}
			if (counter1 == 2 && counter2 == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		
	}
}