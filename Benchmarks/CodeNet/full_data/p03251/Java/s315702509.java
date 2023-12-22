import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), X = in.nextInt(), Y = in.nextInt();
		int[] x = new int[n + 1], y = new int[m + 1];
		x[0] = X;
		y[0] = Y;
		for (int i = 1; i <= n; i++) {
			x[i] = in.nextInt();
		}
		for (int i = 1; i <= m; i++) {
			y[i] = in.nextInt();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		if (x[x.length - 1] < y[0]) {
			System.out.print("No ");
		}
		System.out.println("War");
	}
}