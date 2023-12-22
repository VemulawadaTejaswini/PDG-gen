import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int H = sc.nextInt();
		final int W = sc.nextInt();

		System.out.println(((1 + N - H) * (1 + N - W)));

		sc.close();
	}

}
