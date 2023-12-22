import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int h[] = new int[100];

		for (int i = 0; i < N; i++) {
			h[i] = scan.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N; i++) {
			boolean is_candi = true;
			for (int j = 0; j < i; j++) {
				if (h[j] > h[i]) {
					is_candi = false;
					break;
				}
			}

			if(is_candi) {
				ans++;
			}


		}
		System.out.println(ans);
	}
}