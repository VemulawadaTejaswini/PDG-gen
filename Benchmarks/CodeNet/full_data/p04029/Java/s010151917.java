import java.util.Scanner;

public class Main {
	/*
	 * 問題文 競プロ幼稚園にはN人の子供がいます。
	 * えび先生は、子供たちを一列に並べ、 一人目にはキャンディーを1個,二人目には2個,...,
	 * N人目にはN個あげることにしました。 必要なキャンディーの個数の合計は何個でしょう
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < N; i++) {
			sum += +(i + 1);
		}
		System.out.println(sum);
	}

}