import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String [] args){

		String a = sc.next();
//		int b = Integer.parseInt(sc.next());
		boolean c = false;
		if(a.substring(0,1).equals("9") || a.substring(1,2).equals("9")){
			c = true;
		}
		System.out.println(c);
		System.out.flush();
		sc.close();
	}
}
