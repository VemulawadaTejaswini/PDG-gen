import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long n = scan.nextInt();
		long m = scan.nextInt();

		List<Long> pList = new ArrayList<>();
		List<String> sList = new ArrayList<>();
		Map<Long, Boolean> bMap = new HashMap<>();

		for (int i = 0; i < m; i++) {
			long p = scan.nextInt();
			String s = scan.next();
			pList.add(p);
			sList.add(s);
			bMap.put(p, false);
		}

		long col = 0;
		long pen = 0;

		for (int i = 0; i < m; i++) {
			if (bMap.get(pList.get(i))) {
				if (sList.get(i).equals("WA")) {
					pen++;
				} else {
					col++;
					bMap.put(pList.get(i), true);
				}
			}
		}

		System.out.println(col + " " + pen);

		scan.close();

	}

}
