import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n - 1; i++) {
			if (String.valueOf(s.charAt(i)).equals("A")) {
				if (String.valueOf(s.charAt(i + 1)).equals("C")) {
					list.add(i);
				}
			}
		}


		for (int i = 0; i < q; i++) {
			//System.out.println("q=" + i);
			int count = 0;
			int l = sc.nextInt();
			int r = sc.nextInt();

			for (int j = 0; j < list.size(); j++) {
				if (l - 1 <= list.get(j) && list.get(j) < r - 1) {
					count++;

				}
			}
			System.out.println(count);

//			String t = s.substring(l - 1, r);
			//System.out.println(t);
//			for (int j = 0; j < t.length() - 1; j++) {
//				if (String.valueOf(t.charAt(j)).equals("A")) {
//					if (String.valueOf(t.charAt(j + 1)).equals("C")) {
//						count++;
//					}
//				}
//			}
//			System.out.println(count);
		}
	}
}

