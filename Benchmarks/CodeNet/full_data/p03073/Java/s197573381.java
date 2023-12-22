import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int count = 0;

		char pre = s.charAt(0);
		for(int i = 1; i < s.length()-1; i++) {
			char now = s.charAt(i);
			if(now == pre) {
				count++;
				if(now == '0') {
					pre = '1';
				} else {
					pre = '0';
				}
			} else {
				pre = now;
			}
		}

		System.out.println(count);
	}
}