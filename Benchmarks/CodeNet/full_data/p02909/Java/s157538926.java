import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 課題C1
 *
 * @author ken2
 */
public class Main {

	/** 天気：晴れ */
	private static final String WATHER_SUNNY = "Sunny";
	/** 天気：曇り */
	private static final String WATHER_CLOUDY = "Cloudy";
	/** 天気：飴 */
	private static final String WATHER_RAINY = "Rainy";

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
		if (today.equals(WATHER_SUNNY)) {
			tomorrow = WATHER_CLOUDY;
		} else if (today.equals(WATHER_CLOUDY)) {
			tomorrow = WATHER_RAINY;
		} else if (today.equals(WATHER_RAINY)) {
			tomorrow = WATHER_SUNNY;
		}
		return tomorrow;
	}
}
