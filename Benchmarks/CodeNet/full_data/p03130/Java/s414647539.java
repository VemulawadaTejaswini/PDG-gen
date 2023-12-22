import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] order = new int[4];
		for (int i = 0; i < 3; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			order[A]++;
			order[B]++;
		}
		int max = 0;
		for (int i = 0; i < 4; i++) {
			max = Math.max(max, order[i]);
		}
		System.out.println(max == 2 ? "YES" : "NO");
	}

}