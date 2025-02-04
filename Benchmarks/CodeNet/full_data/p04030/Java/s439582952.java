import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		char[] c = sc.next().toCharArray();
		int n = c.length;
		int[] buffer = new int[n];
		int id = 0;
		for (int i = 0; i < n; i++) {
			if (c[i] == '0') {
				buffer[id++] = 0;
			} else if (c[i] == '1') {
				buffer[id++] = 1;
			} else {
				id = Math.max(0, id - 1);
			}
		}
		for (int i = 0; i < id; i++) {
			System.out.print(buffer[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
