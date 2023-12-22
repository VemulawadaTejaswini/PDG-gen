
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String[] s = new String[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		int a = 0;// ...A
		int b = 0;// B...
		int c = 0;// B...A
		int ans = 0;
		for(int i = 0; i < n; i++) {
			String first = String.valueOf(s[i].charAt(0));
			String end = String.valueOf(s[i].charAt(s[i].length()-1));
			for(int j = 0; j < s[i].length()-1; j++) {
				String ich = String.valueOf(s[i].charAt(j));
				String ni = String.valueOf(s[i].charAt(j+1));
				if (ich.equals("A") && ni.equals("B")) {
					ans++;
				}
			}
			if(first.equals("B") && end.equals("A")) {
				c++;
			} else if (first.equals("B")) {
				b++;
			} else if (end.equals("A")) {
				a++;
			}
		}
		if (c == 0) {
			ans += Math.min(a,b);
		} else if (a == 0 || b == 0) {
			ans += c;
		} else {
			ans += c+1 + Math.min(a-1,b-1);
		}
		System.out.println(ans);
	}

}
