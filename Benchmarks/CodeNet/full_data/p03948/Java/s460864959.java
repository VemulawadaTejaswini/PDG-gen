/* Filename: ARC063D.java
 * Author: Mushiyo
 */

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int N = input.nextInt();
			int T = input.nextInt();
			int[] A = new int[N];
			int[] diffA = new int[N];
			diffA[0] = 0;

			for (int i = 0; i < A.length; ++i) {
				A[i] = input.nextInt();
			}

			int max = Integer.MIN_VALUE;
			for (int i = 0; i < A.length; ++i) {
				for (int j = i + 1; j < A.length; ++j) {
					max = Math.max(max, A[j] - A[i]);
				}
			}

			int countMax = 0;
			for (int i = 0; i < diffA.length; ++i) {
				for (int j = i + 1; j < A.length; ++j) {
					if (A[j] - A[i] == max) {
						++countMax;
					}
				}
			}

			System.out.println(countMax);
		}
	}

}
