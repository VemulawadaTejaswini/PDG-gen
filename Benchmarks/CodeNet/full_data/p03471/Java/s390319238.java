import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int yen = scan.nextInt();
		scan.close();
		
		int[] array = new int[3];
		array[0] = yen / 10000;
		array[1] = yen % 10000 / 5000;
		array[2] = yen % 10000 % 5000 / 1000;

		while (true) {
			int dif = num - (array[0] + array[1] + array[2]);
			if (dif == 0) {
				System.out.println(array[0] + " " + array[1] + " " + array[2]);
				break;
			} else if (dif < 0 || array[0] < 0) {
				System.out.println("-1 -1 -1");
				break;
			}

			if (dif % 4 == 0 && dif / 4 <= array[1]) {
				array[1] -= dif / 4;
				array[2] += dif / 4 * 5;
			} else {
				array[0]--;
				array[1] += 2;
			}
		}
	}
}
