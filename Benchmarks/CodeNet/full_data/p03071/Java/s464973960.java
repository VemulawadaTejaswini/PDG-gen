import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int answer = (a - b >= 2) ? a + (a - 1) :
					 (b - a >= 2) ? b + (b - 1) :
						 			Math.max(a, b) + (Math.max(a, b) - 1);

		System.out.println(answer);
		sc.close();
	}
}