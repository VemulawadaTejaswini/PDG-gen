import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		int z = Integer.parseInt(sc.next());
		int ans = 0;
		x -= (2 * z);
		while(x - y >= 0) {
			x -= (y + z);
			ans++;
		}
		System.out.println(ans);
	}
}