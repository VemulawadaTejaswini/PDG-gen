import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		System.out.println((n-1)*(m-1));
	}
}