import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i <= n / r; i++) {
			for(int j = 0; j <= n / g; j++) {
				for(int k = 0; k <= n / b; k++) {
					if(i * r + j * g + b * k == n)cnt++;
				}
			}
		}
		System.out.println(cnt);
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
