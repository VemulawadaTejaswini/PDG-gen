import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a < b) {
			System.out.println(Math.max(0, b - a - W));
		} else {
			System.out.println(Math.max(0, a - b - W));
		}
	}
}
