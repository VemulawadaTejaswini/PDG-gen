import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		long K = sc.nextLong();
		long cur = 5000L * (long) 1e12;
		for (int i = 0; i < str.length(); ++i) {
			long v = str.charAt(i) - '0';
			if (v == 1) {
				--K;
				if (K == 0) {
					System.out.println(v);
					return;
				}
			} else {
				System.out.println(v);
				return;
			}
		}

	}
}
