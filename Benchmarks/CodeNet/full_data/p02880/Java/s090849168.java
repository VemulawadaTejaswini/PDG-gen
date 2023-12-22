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
				counter++;

		}
		if(counter == 2 || a == 1)
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}