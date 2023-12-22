import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next();
		String t=scanner.next();
		
		String tmp=s;
		for(int i=0;i<s.length();i++) {
			if(tmp.equals(t)) {
				System.out.println("Yes");
				return;
			}
			tmp=tmp.substring(s.length()-1)+tmp.substring(0, s.length()-1);
		}
		System.out.println("No");
	}
}
