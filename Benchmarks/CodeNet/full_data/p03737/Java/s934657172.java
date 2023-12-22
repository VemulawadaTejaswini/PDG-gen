import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		String s = String.valueOf(a.charAt(0))+String.valueOf(b.charAt(0))+String.valueOf(c.charAt(0));
		
		System.out.println(s.toUpperCase());
		
	}

}
