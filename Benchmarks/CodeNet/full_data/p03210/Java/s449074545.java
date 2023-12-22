import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int age = Integer.parseInt(sc.next());

		String s = (age == 3) || (age == 5) || (age == 7) ? "YES" : "NO";

		System.out.println(s);
		sc.close();
	}
}