import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().replaceAll("\\?", ".");
		String t = sc.next();
		int ns = s.length();
		int nt = t.length();
		for(int i = ns - nt ; i >= 0 ; i--) {
			if(t.matches(s.substring(i, i + nt))) {
				String regex = s.replaceAll(s.substring(i, i + nt), t);
				System.out.println(regex.replaceAll("\\.", "a"));
				return;
			}
		}
		System.out.println("UNRESTORABLE");
	}
}