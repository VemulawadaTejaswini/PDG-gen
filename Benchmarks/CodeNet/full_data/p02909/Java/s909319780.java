import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 課題C3
 *
 * @author ken2
 */
public class Main {

	/** 天気 */
	private static final String[] WEATHER = {"Sunny", "Cloudy", "Rainy"};

	/**
	 * メイン処理

	 * @param args 起動引数
	 */
	public static void main(String[] args) {

		// 標準入力から今日の天気を取得
		String today = scanTodayWeather(System.in);

		// 標準出力へ明日の天気を出力
		String tomorrow = predictTomorrowWeather(today);
		System.out.println(tomorrow);
	}

	/**
	 * 今日の天気を取得
	 *
	 * @param in 入力ストリーム
	 * @return 今日の天気
	 */
	private static String scanTodayWeather(InputStream in) {
		String today = null;
		try {
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			today = br.readLine();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return today;
	}

	/**
	 * 今日の天気から明日の天気を予測
	 * ・晴れ→曇り
	 * ・曇り→雨
	 * ・雨→晴れ
	 *
	 * @param today 今日の天気
	 * @return 明日の天気
	 */
	private static String predictTomorrowWeather(String today) {
		String tomorrow = null;
		for (int i=0; i < WEATHER.length; i++) {
			if (today.equals(WEATHER[i])) {
				int p = i < 2 ? i + 1 : 0;
				tomorrow = WEATHER[p];
			}
		}
		return tomorrow;
	}
}
