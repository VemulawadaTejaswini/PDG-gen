
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
