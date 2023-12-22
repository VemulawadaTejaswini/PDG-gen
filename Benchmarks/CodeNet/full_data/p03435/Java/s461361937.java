import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] numbers = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}

		if (
				((numbers[0][0] - numbers[0][1]) == (numbers[1][0] - numbers[1][1])) && ((numbers[0][0] - numbers[0][1]) == (numbers[2][0] - numbers[2][1])) &&
				((numbers[0][1] - numbers[0][2]) == (numbers[1][1] - numbers[1][2])) && ((numbers[0][1] - numbers[0][2]) == (numbers[2][1] - numbers[2][2])) &&
				((numbers[1][0] - numbers[1][1]) == (numbers[1][0] - numbers[1][1]) && (numbers[1][0] - numbers[1][1]) == (numbers[2][0] - numbers[2][1])) &&
				((numbers[1][1] - numbers[1][2]) == (numbers[1][1] - numbers[1][2]) && (numbers[1][1] - numbers[1][2]) == (numbers[2][1] - numbers[2][2]))
			) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}
