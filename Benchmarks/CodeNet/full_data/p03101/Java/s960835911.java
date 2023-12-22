import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());

		long ans = solve(H, W, h, w);
		System.out.println(ans);
	}

	private static long solve(int H, int W, int h, int w) {
		return (H - h) * (W - w);
	}
}
