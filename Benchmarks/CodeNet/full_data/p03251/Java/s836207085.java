import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), X = in.nextInt(), Y = in.nextInt();
		int[] x = new int[n], y = new int[m];
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
		}
		for (int i = 0; i < m; i++) {
			y[i] = in.nextInt();
		}
		Arrays.sort(x);
		Arrays.sort(y);
		int a = x[x.length - 1], b = y[0];
		if (a < b && a <= Y && X < b) {
			System.out.print("No ");
		}
		System.out.println("War");
	}
}