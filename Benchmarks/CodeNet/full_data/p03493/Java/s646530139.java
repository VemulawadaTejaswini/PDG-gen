
import java.util.Arrays;
import java.util.Collections;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N, K;
		int[] numberType;// 実際の数字を格納
		int[] Type;// 実際の数字が何個あるか

		String number = sc.nextLine();
		String[] numbers = number.split(" ");
		N = Integer.parseInt(numbers[0]);
		Type = new int[N];
		K = Integer.parseInt(numbers[1]);

		number = sc.nextLine();
		numbers = number.split(" ");
		numberType = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			Type[Integer.parseInt(numbers[i]) - 1]++;
		}

		//ソートを使用
		Arrays.sort(Type);


		int sum = 0;
		for(int i = Type.length-1; Type.length - 1 - K < i; i--) {
			sum = sum + Type[i];
		}

		System.out.println(N - sum);
	}

}
