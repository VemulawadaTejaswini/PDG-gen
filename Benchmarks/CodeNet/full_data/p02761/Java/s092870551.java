import java.util.Scanner;

public class Main {
	static String s = "";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] kurai = new int[N];
		for(int i=0; i<N; i++) {
			kurai[i] = -1;
		}

		for(int i=0; i<M; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();

			if(kurai[s-1] == -1) {
				kurai[s-1] = c;
			}else {
				if(kurai[s-1] != c) {
					ans = -1;
					break;
				}
			}
		}


		for(int i=0; i<N; i++) {
			if(kurai[i] == -1)
				kurai[i] = 0;
		}

		if(ans == -1 || (N != 1 && kurai[0] == 0))
			ans = -1;
		else {
			int j = 0;
			for(int i=N-1; i>=0; i--) {
				ans += kurai[i] * Math.pow(10, j);
				j++;
			}
		}

		System.out.println(ans);

	}

}
