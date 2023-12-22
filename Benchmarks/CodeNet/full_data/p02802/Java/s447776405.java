import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		Map<Integer, String> res = new HashMap<>();
		for (int i = 0; i < m; i++) {
			res.put(scan.nextInt(), scan.next());
		}

		int col = 0;
		int pen = 0;
		Map<Integer, Boolean> boo = new HashMap<>();
		boo.put(0, false);
		for (Integer nKey : res.keySet()) {
			if (!boo.get(nKey)) {
				if (res.get(nKey).equals("WA")) {
					pen += 1;
				} else {
					col += 1;
					boo.put(nKey, true);
				}
			}
		}

		scan.close();

	}

}
