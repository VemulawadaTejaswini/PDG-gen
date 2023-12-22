import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int count = 0;
		String l = "";
		String r = "";
		if(s.length() % 2 == 0) {
			l = s.substring(0, s.length()/2);
			r = s.substring(s.length()/2, s.length());// eraser
		}else {
			l = s.substring(0, s.length()/2);
			r = s.substring(s.length()/2+1, s.length()); // dream

		}
		StringBuffer sb = new StringBuffer(r);
		r = sb.reverse().toString();
		for(int i = 0; i < l.length(); i++) {
			if(l.charAt(i) != r.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
