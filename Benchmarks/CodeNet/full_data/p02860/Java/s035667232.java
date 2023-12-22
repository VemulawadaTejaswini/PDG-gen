import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		int N = 0;
		String S = "";

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		N = sc1.nextInt();
		S = sc2.nextLine();

		sc1.close();
		sc2.close();

		if((N & 1) == 0)
		{
			String s1 = S.substring(0, (N / 2));
			String s2 = S.substring((N / 2), N);
			System.out.println(s1 + s2);

			if(S.equals(s1 + s2))
			{
				System.out.println("Yes");

			}
			else
			{
				System.out.println("No");
			}
		}
		else
		{
			System.out.println("No");
		}
	}
}
