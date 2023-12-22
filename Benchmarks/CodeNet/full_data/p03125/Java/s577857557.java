import java.util.Scanner;
class act118A {
	public static void main(String[] args)
	{
		int a,b;

		Scanner scanner = new Scanner(System.in);

		a = scanner.nextInt();

		b = scanner.nextInt();


		if( b%a ==0)
			System.out.println(a+b);

		else
			System.out.println(b-a);

	}
}