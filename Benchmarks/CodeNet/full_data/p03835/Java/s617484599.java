import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int l = s.nextInt();
		int i = 0;
		int j = 0;
		int m = 0;
		int count = 0;

		int ans = 0;

		for (i = 0; i <= k; i++) {
			for (j = 0; j <= k; j++) {
				for (m = 0; m <= k; m++) {
					ans = i + j + m;
					if (ans == l) {
						count++;
					}else{

					}
				}
			}
		}System.out.println(count);
	}

}