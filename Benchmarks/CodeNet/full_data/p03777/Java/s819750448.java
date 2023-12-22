
import java.util.Scanner;

public class Main {
	public static void main(String a[])
	{
		Scanner sc= new Scanner(System.in);

		boolean tmp = true;

		if (sc.next() == "D") { tmp = !tmp; }
		if (sc.next() == "D") { tmp = !tmp; }

		if (tmp)
		{
			System.out.println("H");
		}
		else
		{
			System.out.println("D");
		}
	}
}
