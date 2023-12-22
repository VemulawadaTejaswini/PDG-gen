import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int ns = s.length();
		int nt = t.length();
		int[] cnt = new int[ns];
		int count = 0;
		for(int i = 0 ; i < ns ; i++) {
			for(int j = 0 ; j < nt ; j++) {
				if(s.charAt(i) < t.charAt(j)) {
					cnt[i]++;
				}
				if(s.charAt(i) == t.charAt(j)) {
					count++;
				}
			}
		}
		boolean ok = false;
		for(int i = 0 ; i < ns ; i++) {
			if(cnt[i] != 0) {
				ok = true;
			}
		}
		if(ok) {
			System.out.println("Yes");
		} else if(ns < nt && count == nt) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
