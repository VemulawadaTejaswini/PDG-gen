
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int length = S.length();
		char c =' ';
		char d =' ';
		int cnt = 0;
		if(length == 1) {
			System.out.println(0);
			System.exit(0);
		}
		for(int i=0;i<=length/2+1;i++) {
			c = S.charAt(i);
			d = S.charAt(length-1);
			if(c!=d) {
				cnt++;
			}
			length--;
		}
		System.out.println(cnt);
	}

}
