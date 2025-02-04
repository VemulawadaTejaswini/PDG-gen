import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner cin = new Scanner(System.in)) {

			boolean[] array = new boolean[8];
			int fullColor = 0;
			cin.nextInt();

			while (cin.hasNext()) {
				int rate = cin.nextInt();

				if (rate >= 1 && rate <= 399) {
					array[0] = true;
				} else if (rate <= 799) {
					array[1] = true;
				} else if (rate <= 1199) {
					array[2] = true;
				} else if (rate <= 1599) {
					array[3] = true;
				} else if (rate <= 1999) {
					array[4] = true;
				} else if (rate <= 2399) {
					array[5] = true;
				} else if (rate <= 2799) {
					array[6] = true;
				} else if (rate <= 3199) {
					array[7] = true;
				} else if (rate <= 8200) {
					fullColor++;
				}
			}

			int min = 0;
			int max = 0;

			for (boolean b : array) {
				if (b) {
					min++;
				}
			}

			max = min + fullColor;

			if (max > 8) {
				max = 8;
			}

			System.out.println(min + " " + max);
		} finally {
		}
	}

}
