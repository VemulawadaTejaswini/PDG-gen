import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] pm = new int[m];
		String[] sm = new String[m];
		List<Integer> acList = new ArrayList<>();
		Map<Integer, Boolean> bMap = new HashMap<>();

		for (int i = 0; i < m; i++) {
			int p = scan.nextInt();
			String s = scan.next();
			pm[i] = p;
			sm[i] = s;
			if (!acList.contains(pm[i])) {
				if (sm[i].equals("AC")) {
					acList.add(pm[i]);
					bMap.put(pm[i], false);
				}
			}
		}

		int cor = acList.size();
		int pen = 0;

		for (int i = 0; i < m; i++) {
			if (acList.contains(pm[i]) && !bMap.get(pm[i])) {
				if (sm[i].equals("WA")) {
					pen++;
				} else {
					bMap.put(pm[i], true);
				}
			}
		}

		System.out.println(cor + " " + pen);

		scan.close();

	}

}
