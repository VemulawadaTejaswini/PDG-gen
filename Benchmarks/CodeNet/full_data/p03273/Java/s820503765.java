import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] a = new String[h];
		String[] aa = null;
		List<Integer> line = new ArrayList<>();
		List<Integer> column = new ArrayList<>();
		for (int i = 0; i < h; i++) {
			a[i] = sc.next();
			if (a[i].indexOf('#') > -1) {
				line.add(i);
			}
		}
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < line.size(); j++) {
				if (a[line.get(j)].charAt(i) == '#') {
					column.add(i);
					break;
				}
			}
		}
		String ans = "";
		for (int i = 0; i < line.size(); i++) {
			for (int j = 0; j < column.size(); j++) {
				ans += a[line.get(i)].charAt(column.get(j));
			}
			System.out.println(ans);
			ans = "";
		}
	}
}
