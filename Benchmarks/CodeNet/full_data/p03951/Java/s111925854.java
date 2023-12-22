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
		int strLength = Integer.parseInt(strList.get(0));
		String s = strList.get(1);
		String t = strList.get(2);
		String tmpS = null;
		for (int i = 1; i <= strLength; i++) {
			String tmp = s.substring(strLength - i);
			if (t.startsWith(tmp)) {
				tmpS = s + t.substring(i);
			}
		}
		if (tmpS == null) {
			tmpS = s + t;
		}

		int resultLength = tmpS.length();

		System.out.println(resultLength);
	}
}
