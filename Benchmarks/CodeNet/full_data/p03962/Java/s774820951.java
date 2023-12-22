import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * コンソールテスト用Main クラス
 *
 * @author RisaTozawa
 */
public class Main {

	/* コンストラクタ */
	Main() {
	//何もしない
	}

	/**
	 * Atcorder 提出
	 * @return
	 *
	 */

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int tmpColorA;
		int tmpColorB;
		int tmpColorC;
		int count = 0;
		Integer colorA = 0;
		Integer colorB = 0;
		Integer colorC = 0;
		List <Integer> colorKind = new ArrayList<Integer>();
		List <Integer> colorKindTmp = new ArrayList<Integer>();

		/* ペンキの種類を入力 */
		tmpColorA = scanner.nextInt();
		tmpColorB = scanner.nextInt();
		tmpColorC = scanner.nextInt();
		colorA = Integer.valueOf(tmpColorA);
		colorB = Integer.valueOf(tmpColorB);
		colorC = Integer.valueOf(tmpColorC);

		colorKindTmp.add(colorA);
		colorKindTmp.add(colorB);
		colorKindTmp.add(colorC);


		/* 買ったことがない色の種類の場合 */
		for (int i = 0; i < colorKindTmp.size(); i++) {
			if (!colorKind.contains(colorKindTmp.get(i))) {
				/* 買ったペンキの種類をリストに入れる */
				colorKind.add(colorKindTmp.get(i));
				count ++;
			}

		}

		/* 何種類買ったか表示する */
		System.out.println(count);

	}

}
