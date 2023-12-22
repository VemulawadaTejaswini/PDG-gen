import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int N = in.nextInt();;
		int[] t = new int[3 * N];
		for(int i = 0; i < 3 * N; i++){
			t[i] = in.nextInt();
		}
		Arrays.sort(t);
		long sum = 0;
		for(int i = N; i < 2 * N; i++){
			sum += t[i];
		}
		System.out.println(sum);
	}
}
