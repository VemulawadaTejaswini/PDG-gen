import java.util.Scanner;

public class Main {
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();

		System.out.println(Math.max(z - x - y, 0));
	}
}
