
import java.util.Scanner;

public class Main {
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);

		long s = sc.nextLong();

		long i = s / 11 * 2;
		s %= 11;

		if (s == 0) { System.out.println(i); }
		if ( s <= 6) { System.out.println(i + 1); }
		else { System.out.println(i + 2); }
	}
}
