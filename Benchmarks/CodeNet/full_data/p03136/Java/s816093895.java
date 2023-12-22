import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int[] L = new int[N];
	static {
		Arrays.setAll(L, i -> Integer.parseInt(sc.next()));
	}
	public static void main(String[] args) {

		Arrays.sort(L);
		int sum = 0;
		for (int i = 0; i < N-1; i++) {
			sum += L[i];
		}
		if (sum>L[N-1]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");

		}
	}
}
