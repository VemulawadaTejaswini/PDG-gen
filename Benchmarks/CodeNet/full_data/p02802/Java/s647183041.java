import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		Map<Integer, List<String>> map = new HashMap<>();

		for (int i=0; i < M; i++) {
			int p = scan.nextInt();
			String S = scan.nextLine();
			List<String> tmpL = map.get(p);
			if (tmpL == null) {
				tmpL = new ArrayList<>();
			}
			tmpL.add(S);
			map.put(p, tmpL);
		}

		int acCnt = 0;
		int waCnt = 0;
		for (int p : map.keySet()) {
			int tmpWaCnt = 0;
			List<String> tmpL = map.get(p);
			for (String str : tmpL) {
				if (str.trim().equals("AC")) {
					acCnt++;
					waCnt += tmpWaCnt;
					break;
				}
				else if (str.trim().equals("WA")) {
					tmpWaCnt++;
				}
			}
		}
		System.out.println(acCnt + " " + waCnt);
	}
}
