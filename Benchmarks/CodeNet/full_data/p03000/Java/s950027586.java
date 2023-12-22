import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int X = scn.nextInt();
		int ans = 1;
		int now = 0;
		for (int i = 0; i < N; i++) {
			int L = scn.nextInt();
			now += L;
			if (now <= X) {
				ans++;
			}else {
				break;
			}
		}
		System.out.println(ans);
	}

}
