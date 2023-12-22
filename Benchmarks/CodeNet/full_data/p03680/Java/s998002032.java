import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int[]color = new int[N + 1];
		int k = a[0] - 1;
		color[1] = 1;
		int cnt = 1;
		for(int i = 0; i < N; i++) {
			if(k == 1) {
				System.out.println(cnt);
				System.exit(0);
			}else {
				cnt++;
				k = a[k] - 1;
			}
		}
		System.out.println(-1);
	}
}