import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			long k = sc.nextLong();
			String[] splited = s.split("");
			long num = 1;
			long ans = 0;
			String pre = null;
			String first = s.substring(0, 1);
			String end = s.substring(s.length() - 1, s.length());
			boolean top = true;
			Set<String> set = new HashSet<>();
			long topNum = 1;
			long bottomNum = 1;
			for(String hoge : splited) {
				set.add(hoge);
				if(pre == null) {
					pre = hoge;
				} else if(pre.equals(hoge)) {
					num++;
				} else {
					if(top) {
						topNum = num;
					}
					if(!first.equals(end) || !top) {
						ans += num / 2;
					}
					top = false;
					num = 1;
					pre = hoge;
				}
			}
			bottomNum = num;
			if(set.size() == 1) {
				System.out.println(s.length() * k / 2);
				return;
			}
			if(!first.equals(end)) {
				ans += num / 2;
				System.out.println(ans * k);
				return;
			}
			System.out.println(topNum / 2 + ans * k + ((topNum + bottomNum) / 2 * (k - 1)) + bottomNum / 2);
		}

	}

}
