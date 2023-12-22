import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ok = true;
		boolean AfterDream = false;
		while(!s.equals("")) {
			if(s.startsWith("dream")) {
				//System.out.println("dream");
				s = s.substring(5);
				//System.out.println("next:"+s);
				AfterDream = true;
				continue;
			} else 	if(s.startsWith("eraser")) {
				//System.out.println("eraser");
				s = s.substring(6);
				//System.out.println("next:"+s);
			} else if(s.startsWith("erase")) {
				//System.out.println("erase");
				s = s.substring(5);
				//System.out.println("next:"+s);
			} else if(AfterDream==true&&s.startsWith("er")) {
				//System.out.println("er");
				s = s.substring(2);
				//System.out.println("next:"+s);
				AfterDream = false;
			} else {
				//System.out.println(s);
				ok = false;
				break;
			}
			AfterDream = false;
		}
		System.out.println(ok ? "YES" : "NO");
	}
}