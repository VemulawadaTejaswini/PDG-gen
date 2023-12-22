import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static int ProvNum;
	static int CityNum;
	static int[] CityYear;
	static int[] CityOrder;
	static Map<Integer, List<Integer>> map;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		ProvNum = sc.nextInt();
		CityNum = sc.nextInt();
		CityYear = new int[CityNum];
		CityOrder = new int[CityNum];
		map = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < CityNum; i++) {
			List<Integer> list;
			CityYear[i] = sc.nextInt();
			CityOrder[i] = sc.nextInt();
			if (map.containsKey(CityYear[i])) {
				map.get(CityYear[i]).add(CityOrder[i]);
			} else {
				list = new ArrayList<Integer>();
				list.add(CityOrder[i]);
				map.put(CityYear[i], list);
			}
		}
		for (Integer key : map.keySet()) {
			Collections.sort(map.get(key));
		}

		for (int j = 0; j < CityNum; j++) {
			List<Integer> orderList = map.get(CityYear[j]);
			int index = orderList.indexOf(CityOrder[j]) + 1;

			StringBuffer sb = new StringBuffer();
			String year = CityYear[j] + "";
			String number = index + "";
			if (year.length() < 6) {
				for (int k = 0; k < 6 - year.length(); k++) {
					sb.append("0");
				}
			}
			sb.append(year);
			if (number.length() < 6) {
				for (int k = 0; k < 6 - year.length(); k++) {
					sb.append("0");
				}
			}
			sb.append(number);
			System.out.println(sb.toString());

		}
	}
}