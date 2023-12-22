import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		char[] ch = new char[S.length()];
		String ans = "";
		for(int i=0; i<ch.length; i++) {
			ch[i] = 'x';
			ans += ch[i];
		}
		
		System.out.println(ans);
	}

}