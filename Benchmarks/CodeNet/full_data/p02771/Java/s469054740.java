
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		String abc= a+b+c;
		String aaa= a+a+a;
		if(abc.equals(aaa)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}

