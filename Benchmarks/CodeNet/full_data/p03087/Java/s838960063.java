import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());

		String s = sc.next().replace("AC", "aC");

		for (int i = 0; i < q; i++) {
			int l = Integer.parseInt(sc.next()) - 1;
			int r = Integer.parseInt(sc.next()) - 1;
			int count = 0;

			for (int j = l; j < r; j++) {
				if (s.charAt(j) == 'a') {
					count++;
				}
			}

			System.out.println(count);
		}

		sc.close();
	}
}