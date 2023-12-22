import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String [] args){

		String a = sc.next();
//		int b = Integer.parseInt(sc.next());
		boolean c = false;
		c = a.contains("9");
		System.out.println(c);
		System.out.flush();
		sc.close();
	}
}