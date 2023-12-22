import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {

	static int max_X;
	static int max_Y;

	public static void main(String[] args) throws UnsupportedEncodingException {

		Scanner sc = new Scanner(System.in);

		String ans = "Yes";

		int j = sc.nextInt();
		int i = sc.nextInt();
		max_X = i;
		max_Y = j;

		// 適当に格納
		ArrayList<byte[]> map = new ArrayList<byte[]>();
		int h, w;
		for (h = 0; h < j; h++) {
			String st = sc.next();
			map.add(st.getBytes());
		}

		for (h = 0; h < j; h++) {
			byte[] now_x = map.get(h);
			for (w = 0; w < i; w++) {
				if (!check(w,h, now_x, map)) {
					ans = "No";
					break;

				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

	private static boolean check(int w, int h, byte[] now_x, ArrayList<byte[]> map) {
		boolean ischeck = false;

		if (now_x[w] == '.') {
			return true;
		}

		// 左
		if (w - 1 >= 0) {
			if (now_x[w] == now_x[w - 1]) {
				ischeck = true;
				return ischeck;
			}
		}

		// 右
		if (w + 1 < max_X) {
			if (now_x[w] == now_x[w + 1]) {
				ischeck = true;
				return ischeck;
			}
		}

		// 上
		if (h - 1 >= 0) {
			byte[] up_x = map.get(h - 1);
			if (now_x[w] == up_x[w]) {
				ischeck = true;
				return ischeck;
			}
		}

		// 下
		if (h + 1 < max_Y) {
			byte[] down_x = map.get(h + 1);
			if (now_x[w] == down_x[w]) {
				ischeck = true;
				return ischeck;
			}
		}
		return ischeck;
	}

}
