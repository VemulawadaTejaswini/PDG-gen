import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1;
		String s2;
		if(s.length()%2==0) {
			s = s.substring(0,s.length()-2);
		}
		else {
			s = s.substring(0,s.length()-1);
		}
		while(true) {
			s1 = s.substring(0,s.length()/2);
			s2 = s.substring(s.length()/2);
			if(s1.equals(s2)) {
				System.out.println(s.length());
				return;
			}
			s = s.substring(0,s.length()-2);
		}
	}
}