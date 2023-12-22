import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n, k, x, y;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println(k * x + (n - k) * y);
	}
}