import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Integer[] dislike = new Integer[K];
		int[] kingakuArray = new int[String.valueOf(N).length()];
		String answer = "";

		for (int i = 0; i < K; i++) {
			dislike[i] = sc.nextInt();
		}

//		4762143 8
//		1 3 4 5 6 7 8 9
//		22


		kingakuArray = parseInts(String.valueOf(N).split(""));

		for (int i = 0; i < kingakuArray.length; i++) {
			for (int j = 0; j <= 9; j++) {
				if (kingakuArray[i] <= j && !Arrays.asList(dislike).contains(j)) {
					answer = answer.concat(String.valueOf(j));
					break;
				}
			}
		}

		boolean flg = false;
		int minLike = 9;
		for (int j = 1; j <= 9; j++) {
			if (!Arrays.asList(dislike).contains(j)) {
				if (j < minLike) {
					minLike = j;
				}
				if (j <= kingakuArray[0]) {
					flg = true;
				}
			}
		}

		if (flg) {
			answer = "";
			for (int i = 0; i < kingakuArray.length + 1; i++) {
				if (Arrays.asList(dislike).contains(0)) {
					answer = answer.concat(String.valueOf(minLike));
				} else {
					if (i == 0) {
						answer = answer.concat(String.valueOf(minLike));
					} else {
						answer = answer.concat("0");
					}
				}
			}
		}

		System.out.println(answer);
	}

	private static int[] parseInts(String[] s) {
		int[] x = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			x[i] = Integer.parseInt(s[i]);
		}
		return x;
	}
}
