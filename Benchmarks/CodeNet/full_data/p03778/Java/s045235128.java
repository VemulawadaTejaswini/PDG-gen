import java.util.Scanner;

public class Main {
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();

		int t = 0;

		if (y < z && y + x > z)
		{
			System.out.println(0);
			return;
		}
		else
		{
			t = Math.min(Math.abs(z - y), Math.abs(z - (y + x)));
		}

		if (y < z + x && y + x > z + x)
		{
			System.out.println(0);
			return;
		}
		else
		{
			t = Math.min(Math.min(Math.abs(y - (z + x)), Math.abs(y + x - (z + x))), t);
		}

		System.out.println(t);
	}
}
