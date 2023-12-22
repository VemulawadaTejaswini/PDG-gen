import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int h[] = new int[N];
	static int ans = 0;

	public static void main(String[] args) {
		for(int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
		while(true) {
			for(int i = 0; i < N; i++) {
				if(h[i] > 0) {
					solv(i);
					break;
				}
				if(i == N - 1) {
					System.out.println(ans);
					return;
				}
			}
		}
	}

	public static void solv(int st) {
		ans++;
		for(int i = st; i < N; i++) {
			if(h[i] == 0)
				return;
			else
				h[i]--;
		}
	}
}