import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int ans = 0;

		for (int i=1; i<=n; i++) {
			if (kisuKeta(i)) ans++;
		}
		System.out.println(ans);
	}

	private static boolean kisuKeta(int i)
	{
		if (i <10) return true;
		if (i < 100) return false;
		if (i < 1000) return true;
		if (i < 10000) return false;
		if (i < 100000) return true;
		return false;
	}
}
