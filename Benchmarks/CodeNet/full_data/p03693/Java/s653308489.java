import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();

		int num = r * 100 + g * 10 + b;
		System.out.println(r % 4 == 0 ? "YES" : "NO");
	}
}