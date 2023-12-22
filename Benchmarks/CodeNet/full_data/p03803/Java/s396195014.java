
import java.util.Scanner;

public class Main {
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt();

		if (a == b)
		{
			System.out.println("Draw");
		}

		if (a > b)
		{
			if (b == 1)
			{
				System.out.println("Bob");
				return;
			}

			System.out.println("Alice");
		}
		else
		{
			if (a == 1)
			{
				System.out.println("Alice");
				return;
			}

			System.out.println("Bob");
		}
	}
}
