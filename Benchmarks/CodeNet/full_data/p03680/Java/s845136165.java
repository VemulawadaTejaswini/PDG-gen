import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = Integer.parseInt(sc.nextLine());

			Map<Integer, String> map = new HashMap<Integer, String>();
			int next = 1;
			int count = 0;
			for (int i = 1; i <= n; i++) {
				String s = sc.nextLine();
				if (i == next) {
					if (next == 2) {
						System.out.println(count);
						return;
					}
					next = Integer.parseInt(s);
					count++;
					while (next <= i) {
						if (next == 2) {
							System.out.println(count);
							return;
						}
						if (!map.containsKey(next)) {
							// すでに押したことがあるボタンに戻ってしまった場合は到達不可
							System.out.println(-1);
							return;
						}
						next = Integer.parseInt(map.remove(next));
						count++;
					}
				} else {
					map.put(i, s);
				}
			}
		} finally {
			sc.close();
		}
	}
}