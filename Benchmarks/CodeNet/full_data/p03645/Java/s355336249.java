import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] a = new int[M];
		int[] b = new int[M];

		boolean can = false;

		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for(int i = 0; i < M; i++) {
			if(a[i] == 1) {
				int island = b[i];
				for(int j = 0; j < M; j++) {
					if(a[j] == island && b[j] == N) {
						can = true;
						break;
					}
				}
			}

			if(can) {
				break;
			}
		}

		if(can) {
			System.out.println("POSSIBLE");
		} else {
			System.out.println("IMPOSSIBLE");
		}



	}
}
