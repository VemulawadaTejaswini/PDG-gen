import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().replaceAll("\\?", ".");
		String t = sc.next();
		int ns = s.length();
		int nt = t.length();
		for(int i = 0 ; i + nt <= ns ; i++) {
			String regex = s.substring(ns - nt - i, ns - nt - i + nt);
			if(t.matches(regex)) {
				String ans = s.replaceFirst(s.substring(0, ns - nt - i) + regex, s.substring(0, ns - nt - i) + t).replaceAll("\\.", "a");
				System.out.println(ans);
				return;
			}
		}
		System.out.println("UNRESTORABLE");
	}
}