import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(i == 0) ans = k;
			else ans *= k-1;
		}
		System.out.println(ans);
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}