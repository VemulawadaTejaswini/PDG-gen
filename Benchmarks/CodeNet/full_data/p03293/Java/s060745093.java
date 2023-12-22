import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		for(int i=t.length(); i>0; i--) {
			String r = s.substring(i)+s.substring(0,i);
			if(r.equals(t)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
