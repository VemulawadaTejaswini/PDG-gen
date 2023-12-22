import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		int max = -101, min = 101;
		for (int i = 0; i < n; i++) {
			max = Math.max(sc.nextInt(), max);
		}
		for (int i = 0; i < m; i++) {
			min = Math.min(sc.nextInt(), min);
		}
		System.out.println((min > x && max <= y && max <= min) ? "No War" : "War");
	}

}
