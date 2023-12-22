import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0;
		int B = 0;
		int T = 0;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		int i;
		int[] V = new int[N];
		int[] C = new int[N];
		for (i = 0; i < N; i++) {
			V[i] = Integer.parseInt(sc.next());
		}
		for (i = 0; i < N; i++) {
			C[i] = Integer.parseInt(sc.next());
		}
		int count = 0;
		int price = 0;
		for (i = 0; i < N; i++) {
			price = V[i] - C[i];
			if (price > 0) {
				count += price;
			}
		}
		System.out.println(count);

	}

}