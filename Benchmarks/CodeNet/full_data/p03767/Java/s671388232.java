import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] a = new int[3 * N];
		for(int i = 0;i < 3 * N;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(a);
		long sum = 0;
		for(int i = 0;i < N;i++) {
			sum += (long)a[i+N];
		}
		System.out.println(sum);
	}
}