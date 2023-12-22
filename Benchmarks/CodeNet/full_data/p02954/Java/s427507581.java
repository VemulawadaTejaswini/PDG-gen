import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final String S = scan.next();
		scan.close();
		String[] charArray = S.split("");
		int length = charArray.length;
		int[] intS = new int[length];
		// 各マスにいる子供の人数
		int[] children = new int[length];

		// Lなら-1　Rなら1を格納する
		for(int i = 0; i < length; i++) {
			if(charArray[i].equals("L")) {
				intS[i] = -1;
			}else {
				intS[i] = 1;
			}
			children[i] = 0;
		}

		int current = 0;
		// 移動量を計算する
		for(int i = 0; i < length; i++) {
			current = i;
			for(int j = 0; j < 1000; j++) {
				current += intS[current];
			}
			children[current]++;
		}

		for(int i = 0; i < length; i++) {
			System.out.print(children[i] + " ");
		}


	}

}
