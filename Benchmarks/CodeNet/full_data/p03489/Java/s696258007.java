import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String N = sc.nextLine();
		String line = sc.nextLine();
		List<String> lines = Arrays.asList(line.split(" "));

		/*
		List<String> lines1 = Arrays.asList(line1.split(" "));
		List<String> lines2 = Arrays.asList(line2.split(" "));
		*/

		List<String> numLis = new ArrayList<String>();
		Long ans = (long) 0;
		String chNum = null;
		int countNum = 0;
		int delNum = 0;
		boolean nextFlg = true;
		for (int i = 0; i < lines.size(); i++) {
			nextFlg = true;
			for (int k = 0; k < numLis.size(); k++) {
				if (numLis.get(k).equals(lines.get(i))) {
					nextFlg = false;
				}
			}
			if (nextFlg) {
				countNum = 0;
				chNum = lines.get(i);
				for (int j = 0; j < lines.size(); j++) {
					if (chNum.equals(lines.get(j))) {
						countNum++;
					}
				}
				if (countNum > Integer.parseInt(lines.get(i))) {
					delNum = delNum + countNum - Integer.parseInt(lines.get(i));

				} else if (countNum < Integer.parseInt(lines.get(i))) {
					delNum = delNum + countNum;
				}
				numLis.add(lines.get(i));
			}
		}

		System.out.println(delNum);
	}

}