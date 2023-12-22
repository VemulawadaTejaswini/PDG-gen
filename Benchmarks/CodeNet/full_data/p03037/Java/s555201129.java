import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = 1;
		int max = in.nextInt();
		int gate = in.nextInt();
		int cch;
		for (int i = 0; i < gate; i++) {
			for (int j = 0; j < 2; j++) {
				cch = in.nextInt();
				if (j == 0) {
					if (min < cch) min = cch;
				} else {
					if (max > cch) max = cch;
				}
			}
		}
		in.close();
		int ans = max - min + 1;
		if (ans < 0) ans = 0;
		System.out.println(ans);
	}
}