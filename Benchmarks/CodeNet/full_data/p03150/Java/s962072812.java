import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	void doIt() {
		String key = "keyence";
		String s = sc.next();
		int num = s.length() - key.length();
		if(key.equals(s)) {
			System.out.println("YES");
			return;
		}
		for(int i = 0; i < num; i++) {
			String sr = s.substring(i, i + num);
			String ss[] = s.split(sr);
			if(ss[0].concat(ss[1]).equals(key)) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
	

	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
