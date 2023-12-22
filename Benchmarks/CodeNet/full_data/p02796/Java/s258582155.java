import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<int[]> num = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int o = sc.nextInt();
			int r = sc.nextInt();
			int[] node = { o - r, o + r };
			num.add(node);
		}
		List<int[]> sorted = sortNum(num);
		//		for(int[] check:sorted) {
		//		System.out.println(check[0]+","+check[1]);
		//		}
		int tmp = sorted.get(0)[1];
		int cnt = 1;
		for (int i = 1; i < n; i++) {
			if (tmp <= sorted.get(i)[0]) {
				tmp = sorted.get(i)[1];
				cnt++;
			}
		}
		System.out.println(cnt);

	}

	static List<int[]> sortNum(List<int[]> num) {
		List<int[]> sorted = new ArrayList<int[]>();
		for (int[] tmp : num) {
			for (int i = 0; i < sorted.size(); i++) {
				if (tmp[1] < sorted.get(i)[1]) {
					sorted.add(i, tmp);
					break;
				}
			}
			sorted.add(tmp);
		}
		return sorted;
	}

}
