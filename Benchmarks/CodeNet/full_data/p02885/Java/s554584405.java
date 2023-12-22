import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		DecimalFormat df = new DecimalFormat("#,###.##");

		int A = sc.nextInt();
		int B = sc.nextInt();

		if ((A - (2 * B))>0)
		{
			System.out.println(A - (2 * B));
		}
		else if (B > A)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(0);
		}

	}
}