import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long k = sc.nextInt();

		for (int i = 1; i < k + 1; i++) {
			String sn = getSunuke(i);
			System.out.println(sn);
		}
	}

	private static String getSunuke(int m) {
		//		while (m > 0) {
		//			ans += (m % 10);
		//			m /= 10;
		//		}
		//		if(m >= 10) {
		//			ans = 10 * (m - 9) + 9;
		//		}else {
		//			ans = m;
		//		}

		List<String> list = new ArrayList<>();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");

		while(list.size() < m) {
			list.add(list.get(list.size() - 9) + "9");
		}


		return list.get(m-1);
	}

}
