import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int ans = N;
		while (ans > 1) {
			int tmp = ans;
			int i = 2;
			int base = 1;

			while (tmp != 1) {
				if (tmp % i == 0) {
					if (i == ans) {
						base = -1;
						break;
					}
					if (base == 1) {
						base = i;
						tmp /= i;
					} else if (base == i) {
						tmp /= i;
					} else {
						base = -1;
						break;
					}
				} else {
					i++;
				}
			}
			if (base == -1) {
				ans--;
			} else {
				break;
			}
		}
		System.out.print(ans);
		reader.close();
	}
}
