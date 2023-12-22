import java.util.Scanner;

public class Main {

	public static void checkStone(String S, int first, int last) {
		for (int i = first; i < last - 2; i++) {
			//System.out.println(S.charAt(i));
			if ('#' == S.charAt(i) && '#' == S.charAt(i + 1)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		return;
	}

	public static void checkAvoid(String S, int first, int last, int anotherStart, int anotherTarget) {
		Boolean clear = false;
		for (int i = first; i < last - 2; i++) {
			//System.out.println(S.charAt(i));
			if ('#' == S.charAt(i) && '#' == S.charAt(i + 1)) {
				System.out.println("No");
				return;
			}
			if (clear == false && '.' == S.charAt(i) && '.' == S.charAt(i + 1) && '.' == S.charAt(i + 2)) {
				if (i + 1 <= anotherTarget - 1 && i + 1 >= anotherStart)
					clear = true;
			}
		}
		if (clear == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		return;
	}
	// 13 1 2 11 13
	// ..#.#..#.#...

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); // N
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		String S = sc.next();
		sc.close();

		// 岩が最初から2個連なっている場合（そもそも到達不能）でなければ、
		// CDのうち奥の方（大きい方）に到達できた時点でクリア可能（小さい方はその道を辿れる）
		// ＝CDのうち奥の方に対応するAかBが到達可能か。
		// ＝例えばCが奥としてAからみてBが邪魔にならないか。（AがBより左ならそもそも邪魔にならない）
		// ＝Bを動かして石2連続にならない位置に移動できるか。（できればクリア可能）
		// まとめて確認できる部分はあるか？

		if (C > D) {
			checkAvoid(S, A, C, B, D);
			return;
		} else {
			checkStone(S, A, D);
			return;
		}
	}
}