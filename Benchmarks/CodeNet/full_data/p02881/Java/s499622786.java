
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Scannerで値取得。
		 */
		Scanner snum = new Scanner(System.in);

		//値取得
		long numN = snum.nextLong();

		snum.close();

		long tate = 0;
		long yoko = 0;

		//		numNを割る
		long halfLong = (long) (Math.sqrt(numN));

		//		halfLongの値から1ずつデクリメントしながら割り切れる値を探す
		//		割り切れたら割る→縦横の和から２引く
		for (tate = halfLong; tate > 0; tate--) {
			if (numN % tate == 0) {
				yoko = numN / tate;
				System.out.println(tate + yoko - 2);
				break;
			}
		}
	}

}
