import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] x = new int[n];
		int result = 0;

		for (int i = 0; i < x.length; i++) {
			x[i] = in.nextInt();
		}

		for (int i = 0; i < x.length; i++) {
			if (n < Math.abs(k-x[i])) {
				result += x[i];
			}
			else {
				result += Math.abs(k-x[i]);
			}
		}

		System.out.println(result*2);
	}
}