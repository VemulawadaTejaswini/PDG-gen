import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		/*StringBuffer dream_sb = new StringBuffer("dream");
		String dream = dream_sb.reverse().toString();
		StringBuffer dreamer_sb = new StringBuffer("dreamer");
		String dreamer = dreamer_sb.reverse().toString();
		StringBuffer erase_sb = new StringBuffer("erase");
		String erase = erase_sb.reverse().toString();
		StringBuffer eraser_sb = new StringBuffer("eraser");
		String eraser = eraser_sb.reverse().toString();*/
		String dream = "dream";
		String dreamer = "dreamer";
		String erase = "erase";
		String eraser = "eraser";
		
		boolean flag = true;
		int now = 0;
		while(flag) {
			if(now == str.length()) {
				break;
			}
			
			if(now + 5 > str.length()) {
				System.out.println("NO");
				return;
			}
			
			if(str.substring(str.length() - now - 5, str.length() - now).equals(dream)) {
				now += 5;
			} else if(str.substring(str.length() - now - 5, str.length() - now).equals(erase)) {
				now += 5;
			} else if(now + 7 <= str.length()) {
				if(str.substring(str.length() - now - 7, str.length() - now).equals(dreamer)) {
					now += 7;
				} else if(str.substring(str.length() - now - 6, str.length() - now).equals(eraser)) {
					now += 6;
				} else {
					System.out.println("NO");
					return;
				}
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
