
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0, max = 0;
		int n = sc.nextInt();
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'I') {
				x++;
			}else if(c == 'D') {
				x--;
			}
			//System.out.println(x);//デバッグ
			if(x > max) {
				max = x;
			}
		}
		System.out.println(max);
	}
}
