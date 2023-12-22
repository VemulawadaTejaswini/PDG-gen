import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long l = 1;
		while (l * (l + 1) / 2 < X)
			++l;
		System.out.println(l);
	}
}