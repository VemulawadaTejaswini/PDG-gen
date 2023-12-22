import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L = sc.nextInt();

		int gouke = 0;
		int abs = Integer.MAX_VALUE;
		int absNum = 0;
		for (int i = 0; i < N; i++) {
			gouke += L + i;
			if (abs > Math.abs(L + i)) {
				abs = Math.abs(L + i);
				absNum = L + i;
			}
		}
		System.out.println(gouke - absNum);
	}
}
