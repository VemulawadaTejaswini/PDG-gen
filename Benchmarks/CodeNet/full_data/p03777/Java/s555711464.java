
import java.util.Scanner;

public class Main {
	public static void main(String a[])
	{
		Scanner sc= new Scanner(System.in);

		boolean tmp = true;

		if (sc.next() == "D")
		{
			tmp = false;
		}

		if (sc.next() == "D")
		{
			if (tmp){ System.out.println("H"); }
			else { System.out.println("D");}
		}
		else
		{
			if (tmp){ System.out.println("D"); }
			else { System.out.println("H");}
		}
	}
}
