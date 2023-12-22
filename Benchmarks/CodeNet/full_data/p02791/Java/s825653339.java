import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int numArrasy[] = new int[num];

		for (int i = 0; i < num; i++) {

			numArrasy[i] = sc.nextInt();

		}

		int count = 1;
		int tmp = 0;

		for (int i = 1; i < num; i++) {

			if (numArrasy[i - 1] > numArrasy[i]) {
				count++;
			}

		}

		System.out.println(count);

	}

}
