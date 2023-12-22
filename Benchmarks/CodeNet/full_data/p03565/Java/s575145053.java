import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		String f = t.substring(0,1);
		TreeSet<String> ts = new TreeSet<>();
		int lt = s.length() - t.length() + 1;//roop回数

		for(int i = 0;i < lt; i++) {
			if(s.substring(i, i + 1).equals("?") || s.substring(i, i + 1).equals(f)) {//一文字ずつ切り出し
				for(int m = 0; m < t.length(); m++) {//t - 1繰り返す
					if(s.substring(i + m, i + m + 1).equals("?") || s.substring(i + m, i + m + 1).equals(t.substring(m , m + 1))) {
						if(m == t.length() - 1) {
							String ans = s.substring(0, i) + t;
							ans += s.substring(ans.length());
							ans = ans.replaceAll("\\?", "a");
							ts.add(ans);
						}
					} else {
						break;
					}
				}
			}
		}
		if(ts.size() <= 0) {
			System.out.println("UNRESTORABLE");
		} else {
			System.out.println(ts.first());
		}
	}
}