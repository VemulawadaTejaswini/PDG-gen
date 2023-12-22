
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static String Rev(String s) {
		if(s.length() > 1) {
			String t = Rev(s.substring(0, s.length() / 2));
			String u = Rev(s.substring(s.length() / 2));
			return u + t;
		} else {
			return s;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		int rev = 0;
		List<String> list = new ArrayList<>();
		list.add(s);
		for(int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if(t == 1) {
				rev++;
			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if((rev + f) % 2 == 1) {
					list.add(0, c);
				} else {
					list.add(c);
				}
			}
		}
		if(rev % 2 == 1) {
			for(int i = list.size() - 1; i > -1; i--) {
				System.out.print(Rev(list.get(i)));
			}
		} else {
			list.forEach(System.out::print);
		}

	}

}
