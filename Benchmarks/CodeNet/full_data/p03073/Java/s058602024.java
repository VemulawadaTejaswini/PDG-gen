import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	// マップのキー
	// 0はじまり
	private final static String ANSWER1 = "answer1";
	// 1はじまり
	private final static String ANSWER2 = "answer2";

	public static void main(String[] args) {
		// 1. 入力データの処理
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		int sLength = input.length();

		// 2. 正解となりうる2通りの文字列を作成
		// 決定因子:文字列の長さ
		Map<String, String> answerMap = new HashMap<>();
		answerMap = generateAnswer(sLength);

		// 3. キョリを計算し、少ない方とのキョリを出力
		printAnswer(input, answerMap);

	}

	/**
	 * キョリが小さい方を出力
	 * @param answerMap
	 */
	private static void printAnswer(String input, Map<String, String> answerMap) {
		// ANSWER1とのキョリ
		String result1 = answerMap.get(ANSWER1);
		int dis1 = calcDistance(input, result1);
		String result2 = answerMap.get(ANSWER2);
		int dis2 = calcDistance(input, result2);
		// 比較し、出力
		if(dis1 >= dis2) {
			System.out.println(dis2);
			return;
		} else {
			System.out.println(dis1);
			return;
		}
	}

	/**
	 * キョリの計算
	 * 想定:inputとanswerChoiceは同じ長さ
	 * @param answerChoice
	 * @return
	 */
	private static int calcDistance(String input, String answerChoice) {
		int distance = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) != answerChoice.charAt(i)) {
				distance += 1;
			}
		}
		return distance;
	}

	/**
	 * 正解となる文字列を格納するマップ作成
	 * @param length
	 * @return
	 */
	private static Map<String, String> generateAnswer(int length) {
		Map<String, String> result = new HashMap<>();
		StringBuilder answer1 = new StringBuilder();
		StringBuilder answer2 = new StringBuilder();
		for(int i = 0; i < length; i++) {
			if(i % 2 == 0) {
				answer1.append("0");
				answer2.append("1");
			} else {
				answer1.append("1");
				answer2.append("0");
			}
		}

		result.put(ANSWER1, answer1.toString());
		result.put(ANSWER2, answer2.toString());
		return result;
	}

}
