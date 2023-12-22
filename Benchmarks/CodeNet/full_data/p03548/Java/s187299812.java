import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		int z = Integer.parseInt(sc.next());
		x -= z;
		int ans = 0;
		while (x > 0) {
			x = x - y - z;
			if (x >= 0) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}