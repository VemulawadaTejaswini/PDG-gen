
import java.util.Scanner;

public class Main {
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), p = 1;

		sc.close();

		for (int i = 0; i < n; ++i)
		{
			p *= i + 1;
		}

		System.out.println(p % (Math.pow(10, 9) + 7));
	}
}
