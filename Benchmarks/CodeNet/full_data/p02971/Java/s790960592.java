import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		int first = 0;
		int second = 0;
		int loc = 0;
		for (int i = 0; i < N; i++) {
			int k = Integer.parseInt(sc.next());
			if(second <= k) {
				if(first <= k) {
					second = first;
					first = k;
					loc = i;
				} else {
					second = k;
				}
			}
		}
		for (int j = 0; j < N; j++) {
			if(j == loc) {
				System.out.println(second);
			} else {
				System.out.println(first);
			}
		}
	}

}
