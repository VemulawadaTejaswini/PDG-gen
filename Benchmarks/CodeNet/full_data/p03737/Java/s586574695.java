import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		a.toUpperCase();
		b.toUpperCase();
		c.toUpperCase();
		System.out.println(a.charAt(0) + b.charAt(0) + c.charAt(0));
	}

}