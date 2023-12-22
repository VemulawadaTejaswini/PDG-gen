import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.charAt(0) !='A') {
			System.out.println("WA");
			return;
		}
		int st = 2, ed = s.length()-2, cnt = 0;
		boolean bo = false;
		for(int i = st; i <= ed; i++) {
			if(s.charAt(i) =='C') {
				st = i;
				cnt++;
				bo = true;
				break;
			}
		}
		if(!bo || cnt > 1) {
			System.out.println("WA");
			return;
		}
		bo = false;
		for(int i = 1; i < s.length(); i++) {
			if(i == st) {
				continue;
			} else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				System.out.println("WA");
				return;
			}
		}
		System.out.println("AC");
	}
}
