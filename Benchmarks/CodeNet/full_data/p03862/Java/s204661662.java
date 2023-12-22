import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 複数行の標準入力
		ArrayList<String> strList = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String buf = in.nextLine();
			strList.add(buf);
		}
		in.close();

		// 入力データの分割
		String[] line1 = strList.get(0).split(" ");
		int N = Integer.parseInt(line1[0]);
		int x = Integer.parseInt(line1[1]);

		String[] a = strList.get(1).split(" ");
		ArrayList<Integer> aitmp = new ArrayList<Integer>();
		for (String s : a) {
			aitmp.add(new Integer(s));
		}
		int result = 0;
		boolean next = true;
		while (next) {
			boolean recheck = false;
			for (int i = 0; i < N; i++) {
				if ((i + 1) >= N) {
					break;
				}

				if (aitmp.get(i) + aitmp.get(i + 1) > x) {
					result = result + aitmp.get(i + 1) - (x - aitmp.get(i));
					aitmp.set(i + 1, x - aitmp.get(i));
					// 値変更したらからもう一度チェック
					recheck = true;
				}

			}
			if (!recheck) {
				next = false;
			}
		}

		System.out.println(result);
	}
}
