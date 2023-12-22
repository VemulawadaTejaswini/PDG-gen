import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int K = sc.nextInt();

		System.out.println(solve(s, K));
	}

	public static String solve(String s, int K) {

		char[] chars = s.toCharArray();
		int lastIndex = 0;
		for(char i=0; i<chars.length; i++) {
			int count = chage2a(chars[i], K);
			if(count > 0) {
				chars[i] = 'a';
				K -= count;
			}
			else {
				lastIndex = i;
			}
		}

		if(K > 0) {
			chars[lastIndex] += K;
		}

		return String.valueOf(chars);
	}

	public static int chage2a(char c, int count) {
		// 文字cをaにするために必要な回数
		int needCount = ('z' - c) + 1;

		if(count >= needCount) {
			return needCount;
		}
		else {
			return -1;
		}
	}
}