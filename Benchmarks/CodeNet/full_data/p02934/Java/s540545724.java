import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = Integer.valueOf(in.nextLine());
		
		if(N == 1) System.out.println(in.next());
		else {
			int[] a = Arrays.stream(in.nextLine().split(" ", -1)).mapToInt(Integer::valueOf).toArray();
			int x = call(a, 0);
			double sum = 0;
			for(int i : a) sum += 1 * x / i;
			System.out.println(x / sum);
		}

	}

	public static int a(int a, int b) {
		return a > b ? a % b == 0 ? a : a * b
				: b % a == 0 ? b : a * b;
	}

	public static int call(int[] a, int idx) {
		return a(a[idx], idx != a.length - 1 ? call(a, idx + 1) : 1);
	}
}
