import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int st = 0, end = 0, len = 0, max = 0;
		for(int i = 0;i < s.length();i ++) {
			char c = s.charAt(i);
			if(c == 'A' && st == 0) st = i;
			if(c == 'Z') {
				end = i;
				len = end - st + 1;
				if(max < len) max = len;
				st = 0;
				end = 0;
			}
		}
		System.out.println(max);
	}
}