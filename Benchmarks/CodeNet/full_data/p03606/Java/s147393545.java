import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int l = reader.nextInt();
			int r = reader.nextInt();
			ans += Math.abs(l-r) + 1;
		}


		System.out.println(ans);
		reader.close();

	}
}



