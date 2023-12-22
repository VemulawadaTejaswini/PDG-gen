import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);
		boolean ok = true;
		boolean AfterDream = false;
		while(sb.length()!=0) {
			if(sb.toString().startsWith("dream")) {
				sb.delete(0, 5);
				AfterDream = true;
				continue;
			} else 	if(sb.toString().startsWith("eraser")) {
				sb.delete(0, 6);
			} else if(sb.toString().startsWith("erase")) {
				sb.delete(0, 5);
			} else if(AfterDream==true&&sb.toString().startsWith("er")) {
				sb.delete(0, 2);
				AfterDream = false;
			} else {
				ok = false;
				break;
			}
			AfterDream = false;
		}
		System.out.println(ok ? "YES" : "NO");
	}
}