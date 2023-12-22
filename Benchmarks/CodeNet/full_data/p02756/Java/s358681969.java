
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		int rev = 0;
		for(int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if(t == 1) {
				rev++;
			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if((rev + f) % 2 == 1) {
					s = c + s;
				} else {
					s = s + c;
				}
			}
		}
		if(rev % 2 == 1) {
			String t = "";
			for(int i = s.length() - 1; i > -1; i--) {
				t += s.charAt(i);
			}
			s = t;
		}
		System.out.println(s);

	}

}
