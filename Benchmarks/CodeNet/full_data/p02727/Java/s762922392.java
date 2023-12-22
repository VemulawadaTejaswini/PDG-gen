package abc160;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int eatRed = sc.nextInt();
		int eatGreen = sc.nextInt();

		int haveRed = sc.nextInt();
		int haveGreen = sc.nextInt();
		int haveInv = sc.nextInt();

		Integer[] redDelicious = new Integer[haveRed];
		for (int i = 0; i < haveRed; i++) {
			redDelicious[i] = sc.nextInt();
		}

		Integer[] greenDelicious = new Integer[haveGreen];
		for (int i = 0; i < haveGreen; i++) {
			greenDelicious[i] = sc.nextInt();
		}

		Integer[] invDelicious = new Integer[haveInv];
		for (int i = 0; i < haveInv; i++) {
			invDelicious[i] = sc.nextInt();
		}

		sc.close();

		Arrays.sort(redDelicious, Collections.reverseOrder());
		Arrays.sort(greenDelicious, Collections.reverseOrder());
		Arrays.sort(invDelicious);

		int result = 0;

		Integer[] ateRed = new Integer[eatRed];
		for (int i = 0; i < eatRed; i++) {
			ateRed[i] = redDelicious[i];
			for (int j = 0; j < haveInv; j++) {
				if (ateRed[i] < invDelicious[j]) {
					ateRed[i] = invDelicious[j];
					invDelicious[j] = 0;
					break;
				}
			}
			result += ateRed[i];
		}

		Integer[] ateGreen = new Integer[eatGreen];
		for (int i = 0; i < eatGreen; i++) {
			ateGreen[i] = greenDelicious[i];
			for (int j = 0; j < haveInv; j++) {
				if (ateGreen[i] < invDelicious[j]) {
					ateGreen[i] = invDelicious[j];
					invDelicious[j] = 0;
					break;
				}
			}
			result += ateGreen[i];
		}

		System.out.print(result);
	}


}
