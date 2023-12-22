import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int L[] = new int[N];

		for (int i = 0; i < L.length; i++) {
			L[i] = sc.nextInt();
		}

		int cnt = 0;
		int d = 0;
		for (int i = 0; i < N; i++) {
			d += L[i];
			cnt++;
			if (d>X) {
				break;
			}
		}
		System.out.println(cnt);
	}
}
