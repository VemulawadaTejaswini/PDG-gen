import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();

		scan.close();

		int ans = i / 2;
		if (i % 2 == 1) {
			ans += 1;
		}

		System.out.println(ans);
	}
}
