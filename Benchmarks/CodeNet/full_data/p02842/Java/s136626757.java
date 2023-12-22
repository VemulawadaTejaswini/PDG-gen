import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = (int) (n / (1.08));
		if (((int) ((ans - 1) * 1.08) == n))
			System.out.println(ans - 1);
		else if ((int) ((ans + 1) * 1.08) == n)
			System.out.println(ans + 1);
		else if ((int) (ans * 1.08) == n)
			System.out.println(ans);
		else
			System.out.println(":(");

		sc.close();
	}
}
