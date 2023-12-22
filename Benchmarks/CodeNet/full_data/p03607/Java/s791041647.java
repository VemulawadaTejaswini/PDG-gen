import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * お遊び
 *
 * @author s-sugimoto
 */
public class Main {

	/**
	 * 隠蔽
	 */
	private Main() {
	}

	/**
	 * main
	 *
	 * @param args 起動引数
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();

		Map<Integer, Boolean> resultMap = new HashMap<>();
		for (int i = 0; i < count; i++) {
			int input = scanner.nextInt();
			Boolean tmp = resultMap.get(input);
			if (tmp == null) {
				resultMap.put(input, true);
			} else {
				if (tmp) {
					resultMap.put(input, false);
				} else {
					resultMap.put(input, true);
				}
			}
		}

		System.out.println(resultMap.entrySet().stream().map(e -> e.getValue()).filter(e -> e == true).count());
	}

}
