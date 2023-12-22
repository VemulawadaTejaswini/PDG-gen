package TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ワールドインテック福岡営業所 荒木広夢
 * @since  2019/01/27
 * @version 0.0
 *
 */
public class Main {
	//定数宣言
	public final static String SYTEMMSG = "購読している新聞画面より数値で入力してください。X:1 Y:2 両方:3 終了:z";
	public final static String EXCEPTIONMSG = "例外NumberForamtExceptionをcatchしました。正しい数値を入力してください。";

	/**
	 * コマンドライン引数の実行
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//ローカル変数宣言
		int flg = 1;//入力値を管理する
		String readX = null; //画面からの入力値
		String readY = null;//画面からの入力値
		String readXy = null;//画面からの入力値

		int numX = 0;//xを購読した人の入力値
		int numY = 0;//yを購読した人の入力値
		int numXy = 0;//xy両方を購読した人の入力値

		int max = 0;
		int small = 0;

		SysMsg(SYTEMMSG);
		//画面からの入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (;;) {
			/**
			 * Xの購読の判定①
			 */
			if (br.readLine().equals("1")) {
				try {
					readX = br.readLine();//画面からの入力値を変数に格納
					numX = Integer.parseInt(readX);//文字列から整数へ変換
					numX++;//カウントする
				} catch (NumberFormatException e) {
					SysMsg(EXCEPTIONMSG);
					e.printStackTrace();
				}
				/**
				 * Yの購読の判定②
				 */
			} else if (br.readLine().equals("2")) {
				try {
					readY = br.readLine();
					numY = Integer.parseInt(readY);
					numY++;//カウントする
					flg = 2;
				} catch (NumberFormatException e) {
					SysMsg(EXCEPTIONMSG);
					e.printStackTrace();
				}
				/**
				 * XY両方の購読の判定③
				 */
			} else if (br.readLine().equals("3")) {
				try {
					readXy = br.readLine();
					numXy = Integer.parseInt(readXy);
					numXy++;//カウントする
					flg = 2;
				} catch (NumberFormatException e) {
					SysMsg(EXCEPTIONMSG);
					e.printStackTrace();
				}
			}
			/**
			 * 入力された値のカウントを計算する
			 */

			if (flg != 1 && flg != 2 ) {
				max =  numX + numY;
			}
			else {
			 //未記述:最小に人数
			}
			System.out.println("xyの両方の新聞を購読している最大人数は" + max + "人、" + "最小人数は" );

		}
	}

	/**
	 * メッセージメソッド
	 * @param msg
	 */
	public final static void SysMsg(final String msg) {
		System.out.println(msg);
	}
}