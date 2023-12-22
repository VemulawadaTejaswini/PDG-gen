import java.util.*;

public class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		double odds = 0;
		int k = n%2;

		if (n == 1)
			odds = 1;
		else if (k == 0)
			odds = .5;
		else if (k == 1)
			odds = .6;

		System.out.println (odds);
	}
}