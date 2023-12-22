import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int coins = 0;
		for (int i = 0; i < 2; i++) {
			if (a > b) {
				coins += a;
				a--;
			} else {
				coins += b;
				b--;
			}
		}
		System.out.println(coins);
	}
}
