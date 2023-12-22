import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		if(s.equals("zyxwvutsrqponmlkjihgfedcba")) {
			System.out.println(-1);
			return;
		}
		if(n == 26) {
			for(int i = 0 ; i < n - 1 ; i++) {
				if((int)s.charAt(i) != Integer.valueOf((int)s.charAt(i + 1)) - 1) {
					if(s.charAt(i) == 'z') {
						String temp = s.substring(i + 1);
						char c = 'a';
						for(int j = 0 ; j < temp.length() ; j++) {
							if(c < temp.charAt(j)) c = temp.charAt(j);
						}
						System.out.println(s.substring(0, i + 1) + c);
						return;
					} else {
						System.out.println(s.substring(0, i) + (char)(s.charAt(i) + 1));
						return;
					}
				}
			}
		} else {
			char min = 'z';
			int[] cnt = new int[26];
			for(int i = 0 ; i < s.length() ; i++) {
				cnt[(int)(s.charAt(i) - 'a')]++;
			}
			for(int i = 0 ; i < 26 ; i++) {
				if(cnt[i] == 0) {
					min = (char)(i + 'a');
					break;
				}
			}
			System.out.println(s + min);
		}
	}
}
