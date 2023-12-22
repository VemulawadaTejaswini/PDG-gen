import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int ans = 1;
		for (int i = 0; i < n; i++)
			if (ans * 2 < ans + k)
				ans *= 2;
			else
				ans += k;
		System.out.println(ans);
	}
}