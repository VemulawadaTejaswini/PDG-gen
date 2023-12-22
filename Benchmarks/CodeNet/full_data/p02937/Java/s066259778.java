import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String t = scn.next();
		int i = 0;
		long ans = 0;
		while(true) {
			int num = s.indexOf(t.charAt(i));
			if(num == -1) {
				ans = -1;
				break;
			}
			boolean j = true;
			i++;
			while(j&&i<t.length()) {
				int sub = s.substring(num).indexOf(t.charAt(i));
				if(sub==-1) {
					break;
				}else {
					i++;
					num+=sub;
				}
			}
			if(i<t.length()) {
				ans+=s.length();
			}else {
				ans+=num + 1;
				break;
			}
		}
		System.out.println(ans);
		scn.close();
	}
}