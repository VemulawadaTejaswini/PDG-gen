import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		if(s.equals("zyxwvutsrqponmlkjihgfedcba")) {
			System.out.println(-1);
			System.exit(0);
		}
		if(s.equals("abcdefghijklmnopqrstuvwxyz")) {
			System.out.println(-1);
			System.exit(0);
		}
		if(s.length() == 26) {
			String t = "";
			int[] a = new int[26];
			for(int i = 0; i < 25; i++) {
				if(s.charAt(i) > s.charAt(i + 1)) {
					if(i == 1) {
						System.out.println(-1);
						System.exit(0);
					}
					break;
				}else {
					t += s.substring(i, i + 1);
					a[s.charAt(i) - 'a']++;
				}
			}
			for(int i = 0; i < 26; i++) {
				if(a[i] == 0) {
					t += (char)(i + 'a');
					System.out.println(t);
					if(t.equals(s)) {
						System.out.println(-1);
					}
					break;
				}

			}
		}else {
			int[] a = new int[26];
			for(int i = 0; i < s.length(); i++) {
				a[s.charAt(i) - 'a']++;
			}
			for(int i = 0; i < 26; i++) {
				if(a[i] == 0) {
					System.out.println(s + (char)(i + 'a'));
					break;
				}
			}
		}
	}
}