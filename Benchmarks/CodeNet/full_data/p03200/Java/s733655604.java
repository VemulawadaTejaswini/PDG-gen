import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int res = 0, count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'W') {
				res += i - count;
				count++;
			}
		}
		System.out.println(res);
	}
}