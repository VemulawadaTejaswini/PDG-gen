import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		// モンスター体力
		long h = sc.nextLong();

		// 攻撃回数
		long re = 0;
		long deep = 1;

		// 初めの1匹を攻撃
		re = attck(h, re, deep);

		System.out.println(re - 1);

	}

	private static long attck(long h, long re, long deep) {
		if (h == 1) {
			return (long) Math.pow(2, deep);
		}
		deep++;
		return attck(h / 2, (long) Math.pow(2, deep), deep);
	}

}