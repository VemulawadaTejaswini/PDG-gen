import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int counter = 0;
		for(int i = 1; i<=9; i++)
		{
			if(a%i == 0)
			{
				counter++;
				if(a/i > 9)
					counter--;
			}
		}
		if(a == 100)
			System.out.println("No");
		else if(counter >= 2 || Math.sqrt(a)%1 == 0)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}