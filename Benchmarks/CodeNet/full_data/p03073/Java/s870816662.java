import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ans0 = 0;
		int ans1 = 0;
		String s = sc.next();
		for(int i = 0; i < s.length(); ++i) {
			if(s.charAt(i) == '0') {
				if((i&1) == 0) ++ans1;
				else ++ans0;
			}else {
				if((i&1) == 0) ++ans0;
				else ++ans1;
			}
		}
		
		System.out.println(Math.min(ans0, ans1));
	}
}
