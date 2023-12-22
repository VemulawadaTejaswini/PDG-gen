import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int[] antenna = new int[5];

		for (int i = 0; i < 5; i++) {
			antenna[i] = sc.nextInt();
		}

		int k = sc.nextInt();

		boolean flag = true;
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (antenna[j] - antenna[i] > k) {
					flag = false;
					break;
				}
			}
		}

		if (flag) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}

}
