
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		Map<String,Integer> lst = new TreeMap<String,Integer>();

		for (int i = 0; i < N; i++) {
			String s = sc.next();
			int pts = 100 - sc.nextInt();
			String s_pts = String.valueOf(pts);
			while (s_pts.length() < 3) {
				s_pts = "0" + s_pts;
			}
			s = s + " " + s_pts;
			lst.put(s,i+1);
		}

		for (String s : lst.keySet()) {
			System.out.println(lst.get(s));
		}

	}
}
