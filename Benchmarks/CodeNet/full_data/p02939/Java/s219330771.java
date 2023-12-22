import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int len = s.length;
		
		int cnt = 0;
		String prev = "";
		String now = "";
		for ( int i = 0; i < len; i++ ) {
			now += s[i];
			if(!prev.equals(now)) {
				// System.out.println(now);
				cnt++;
				prev = now;
				now = "";
			}			
		}
		System.out.println(cnt);
		in.close();
	}
}
