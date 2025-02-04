import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char[] c = sc.next().toCharArray();
		int x = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (c[i] == 'I') {
				x++;
			} else {
				x--;
			}
			max = Math.max(max, x);
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
