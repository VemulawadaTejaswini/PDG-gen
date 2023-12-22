import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 株式会社ワールドインテック 荒木広夢
 * @since 2020 03.09
 *
 */
class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strHkey = br.readLine();

		if (inputDataCheck(strHkey)) {
			String reg = "(hi)*";
			System.out.println(strHkey.matches(reg) ? "Yes" : "No");
		}
	}

	/**
	 * 未入力
	 * バイト数
	 * 文字列チェック
	 * @param hKye
	 * @return
	 */
	public static boolean inputDataCheck(final String hKye) {
		//未入力、バイト数チェック
		if (hKye == null || hKye.length() <= 0) {
			System.out.println("文字が入力されていません。半角英文字で入力してください。");
			return false;
		}

		//偶数でない hitachi文字列でない為処理を返す
		if (hKye.length() % 2 != 0) {
			return false;
		}

		return true;
	}
}
