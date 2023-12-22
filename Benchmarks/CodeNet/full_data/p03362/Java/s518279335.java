import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		no4();
	}

	static void no4() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int i = 1;
			int count = 0;

			while (count < n) {
				int yakusu = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0)
						yakusu++;
				}
				if (yakusu == 2) {
					System.out.print(" ");
					System.out.print(i);
					count++;
				}
				i++;
			}
		}
		System.out.println("");
	}
}