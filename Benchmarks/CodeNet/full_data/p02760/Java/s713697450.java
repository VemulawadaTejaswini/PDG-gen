import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[]bingo = new int[9];

		for(int i = 0; i < 9; i++) {
			String[] temp = scanner.nextLine().split(" ");
			bingo[i] 	 = Integer.parseInt(temp[0]);
			bingo[i + 1] = Integer.parseInt(temp[1]);
			bingo[i + 2] = Integer.parseInt(temp[2]);

			i += 2;
		}

		int n = Integer.parseInt(scanner.nextLine());
		int b = 0;

		for(int i = 0; i < n; i++) {

			b = Integer.parseInt(scanner.nextLine());

			for(int j = 0; j < 9; j++) {

				if(bingo[j] == b) bingo[j] = 0;

			}
		}


		for(int i = 0; i < 3; i++) {
			if(bingo[i] + bingo[i + 1] + bingo[i + 2] == 0) {

				System.out.println("Yes");
				return;

			}
			i += 2;
		}

		if(bingo[0] + bingo[4] + bingo[8] == 0) {

			System.out.println("Yes");
			return;

		}

		if(bingo[2] + bingo[4] + bingo[6] == 0) {

			System.out.println("Yes");
			return;

		}

		System.out.println("No");
	}
}