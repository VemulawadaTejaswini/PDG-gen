import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int len = s.length();
		int index = 0;
		if(s.equals(t)) {
			System.out.println("Yes");
		}else {
			while(index < len) {
				s = s.substring(s.length()-1)+s.substring(0, s.length()-1);
				if(s.equals(t)) {
					System.out.println("Yes");
					return;
				}else {
					index++;
				}
			}
		}
		if(index == len) {
			System.out.println("No");
		}
	}
}
