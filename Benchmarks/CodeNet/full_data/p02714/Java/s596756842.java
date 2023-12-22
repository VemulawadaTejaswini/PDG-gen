import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.nextLine());
		long ans = 0;

		ArrayList<Integer> r_List = new ArrayList<Integer>();
		ArrayList<Integer> g_List = new ArrayList<Integer>();
		ArrayList<Integer> b_List = new ArrayList<Integer>();

		String string = sc.nextLine();

		for (int i = 0; i < A; i++) {
			char c = string.charAt(i);
			if (c == 'R') {
				r_List.add(i + 1);
			} else if(c == 'G'){
				g_List.add(i + 1);
			} else if(c == 'B'){
				b_List.add(i + 1);
			}
		}

		for (int i = 0; i < r_List.size(); i++) {
			for (int j = 0; j < g_List.size(); j++) {
				for (int k = 0; k < b_List.size(); k++) {
					int max = Math.max(r_List.get(i), Math.max(g_List.get(j), b_List.get(k)));
					int min = Math.min(r_List.get(i), Math.min(g_List.get(j), b_List.get(k)));
					int mid = r_List.get(i) + g_List.get(j) + b_List.get(k) - max -min;
					if (mid - min != max - mid) {
						ans++;
					}
				}
			}
		}

		System.out.println(ans);
	}
}