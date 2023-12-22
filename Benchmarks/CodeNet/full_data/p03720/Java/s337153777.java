import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] r = new int[n];
		for (int i = 0; i < 2 * m; i++)
			r[Integer.parseInt(sc.next()) - 1]++;
		for (int i = 0; i < n; i++)
			System.out.println(r[i]);
	}
}