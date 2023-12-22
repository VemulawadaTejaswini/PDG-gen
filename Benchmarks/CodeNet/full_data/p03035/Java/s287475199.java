import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());

		System.out.println((a >= 13) ? b : (a <= 5) ? 0 : b/2);

		sc.close();
	}
}