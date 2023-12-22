import java.util.Scanner;
/*import java.util.Arrays;*/

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x[] = new int[a];
		int y[] = new int[b];

		for (int i = 0; i < b; i++) {
			y[i] = a;
		}
		for (int j = 0; j < a; j++) {
			x[j] = b;
		}
		if (y[0] < x[0]) {
			for (int k = 0; k < b; k++) {
				System.out.print(y[k]);
			}
		} else if (x[0] < y[0]) {
			for (int m = 0; m < a; m++) {
				System.out.print(x[m]);
			}
		}
			for (int k = 0; k < b; k++) {
				System.out.print(y[k]);
			}
		}
	}

