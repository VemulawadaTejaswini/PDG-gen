import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int half, i;
		for(i = S.length() - 1;i > 1;i --) {
			if(i % 2 != 0)continue;
			int ac = 0;
			for(int k = 0;k < i;k ++) {
				char c = S.charAt(k);
			}
			for(int k = 0;k < i / 2; k ++) {
				char c1 = S.charAt(k), c2 = S.charAt(k + i / 2);
				if(c1 == c2) ac ++;
			}
			if(ac == i / 2) break;
		}
		System.out.println(i);
	}
}