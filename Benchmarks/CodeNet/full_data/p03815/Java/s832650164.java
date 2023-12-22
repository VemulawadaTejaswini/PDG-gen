

import java.util.Scanner;

public class Main {
	public static void main(String ar[])
	{
		Scanner sc = new Scanner(System.in);

		long s = sc.nextLong();

		for (int i = 0; true; ++i)
		{
			if (s > 11) { ++i; s -= 11; continue; }

			s -= 6;
			if (s <= 0) { System.out.println(i + 1); return; }
			--i;

			s -= 5;
			if (s <= 0) { System.out.println(i + 1); return; }
		}
	}
}
