import java.util.Scanner;

public class ACM {
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		int n, sum=0;
		n=sc.nextInt();
		while (n >= 1)
		{
			sum += n % 10;
			n /= 10;
		}
		if (sum != 1)
			System.out.print(sum);
		else
			System.out.print(10*sum);
	}
}
