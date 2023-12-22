import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String o = scan.next();
		String e = scan.next();
		if (o.length()==e.length()) {			
			for (int i = 0; i < o.length(); i++) {
				System.out.print(o.charAt(i));
				System.out.print(e.charAt(i));
			}
		} else {
			for (int i = 0; i < e.length(); i++) {
				System.out.print(o.charAt(i));
				System.out.print(e.charAt(i));
				if (i == e.length()-1) {
					System.out.print(o.charAt(i+1));
				}
			}
		}
	}
}
