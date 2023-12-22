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
			if(s.substring(0, i).concat(s.substring(i + num, s.length())).equals(key)) {
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
