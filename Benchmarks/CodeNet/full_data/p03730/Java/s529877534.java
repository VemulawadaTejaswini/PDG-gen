
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

		in.close();

		for (int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; ++j) {
				if(a * i - b * j == c) {
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}

}
