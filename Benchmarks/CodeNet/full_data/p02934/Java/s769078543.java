import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = Integer.valueOf(in.nextLine());
		
		if(N == 1) System.out.println(in.nextLine());
		else {
			int[] a = Arrays.stream(in.nextLine().split(" ", -1)).mapToInt(Integer::valueOf).toArray();
			long x = 1;
			for(int i: a) x = a(x, i);
			double sum = 0;
			for(int i : a) sum += 1 * x / i;
			System.out.println(x / sum);
		}
	}

	public static long a(long a, long b) {
		return a > b ? a % b == 0 ? a : a * b
				: b % a == 0 ? b : a * b;
	}

}
