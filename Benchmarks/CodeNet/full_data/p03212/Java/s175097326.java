import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static String[] num = {"3", "5", "7"};
	static List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		rec("");
		List<Long> list1 = new ArrayList<Long>();
		for(String t : list) {
			if(isCheck(t)) {
				list1.add(Long.parseLong(t));
			}
			//System.out.println(t);
		}
		int cnt = 0;
		//System.out.println(list1.size());
		for(long t : list1) {
			if(t <= N) {
				cnt++;
				//System.out.println(t);
			}
			//System.out.println(t);
		}
		System.out.println(cnt);
	}
	static boolean isCheck(String t) {
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		for(int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if(c == '3') {
				flag1 = true;
			}
			if(c == '5') {
				flag2 = true;
			}
			if(c == '7') {
				flag3 = true;
			}
			if(flag1 && flag2 && flag3) {
				return true;
			}
		}
		return false;
	}
	static void rec(String s) {
		if(s.length() > 9) {
			return;
		}
		for(int i = 0; i < 3; i++) {
			//s += num[i];
			list.add(s + num[i]);
			rec(s + num[i]);
			//System.out.println(s);
		}
	}
}