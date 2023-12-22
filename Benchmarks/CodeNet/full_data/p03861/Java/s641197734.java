import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long x = Long.parseLong(sc.next());

		long count = (b - a) / x + ((a % x == 0) ? 1 : 0);

		System.out.println(count);

		sc.close();
	}
}