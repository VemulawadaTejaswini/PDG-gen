import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		boolean flag = true;
		if(s.length() != a + b + 1) {
			System.out.println("No");
			return;
		}
		for(int i = 0; i < a; i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				flag = false;
				break;
			}
		}
		if(s.charAt(a) != '-') {
			flag = false;
		}
		for(int i = a + 1; i < a + b + 1; i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}