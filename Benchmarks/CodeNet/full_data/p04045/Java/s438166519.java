import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int[] hateNumberArray;
	static int k = 0;

	public static void main(String[] args) {

		int anser = 0;
		int payment = 0;
		int[] splitNumberArray = new int[4];

		Scanner scan = new Scanner(System.in);
		payment = scan.nextInt();
		k = scan.nextInt();

		anser = payment;

		hateNumberArray = new int[k];

		for (int i = 0; i < k; i++) {
			hateNumberArray[i] = scan.nextInt();
		}

		while (anser < 10000) {

			if (isHateNumber(splitNumber(anser))) {
				anser++;
			} else {
				break;
			}
		}

		System.out.println(anser);

	}

	//整数を桁ごとに分解する処理
	private static ArrayList<Integer> splitNumber(int number) {
		ArrayList<Integer> numberArray = new ArrayList<>();
		numberArray.add(number % 10);
		if (number >= 10) {
			numberArray.add((number - numberArray.get(0)) / 10 % 10);
		}
		if (number >= 100) {
			numberArray.add((number - numberArray.get(1) * 10 - numberArray.get(0)) / 100 % 10);
		}
		if (number >= 1000) {
			numberArray.add((number - numberArray.get(2) * 100 - numberArray.get(1) * 10
					- numberArray.get(0)) / 1000);
		}
		return numberArray;

	}

	//嫌いな数字が含まれているか
	private static boolean isHateNumber(ArrayList<Integer> numberArray) {
		for (int j = 0; j < numberArray.size(); j++) {
			for (int i = 0; i < k; i++) {
				if (numberArray.get(j) == hateNumberArray[i]) {
					return true;
				}
			}

		}
		return false;
	}

}
