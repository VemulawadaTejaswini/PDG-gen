import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] b = new int[N-1];
		for (int i = 0; i < N-1; i++)
			b[i] = sc.nextInt();
		int sum = b[0] + b[N-2];
		for (int i = 0; i < N-2; i++) {
			sum += Math.min(b[i], b[i+1]);
		}
		System.out.println(sum);
	}
}
