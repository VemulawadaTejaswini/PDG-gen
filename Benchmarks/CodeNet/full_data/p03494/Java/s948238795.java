import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 処理対象個数の入力
		int input_1 = sc.nextInt();
		// 処理対象の入力
		String input_2 = sc.next();
		int[] target_array = Stream.of(input_2.split(" ")).mapToInt(x -> {
			try {
				return Integer.parseInt(x);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return 0;
		}).toArray();

		int result = countExponent2(target_array[0]);
		int tmp;
		for (int i = 1; i < target_array.length; i++) {
			tmp = countExponent2(target_array[i]);
			if(result > tmp) {
				result = tmp;
			}
		}

		// 出力
		System.out.println(result);
		sc.close();

	}

	private static int countExponent2(int x) {
		int exponent2 = 0;
		// 引数に対して何回、２で割る処理が実行できるかを調べる
		while(x%2 == 0) {
			x = x/2;
			exponent2++;
		}

		return exponent2;
	}

}
