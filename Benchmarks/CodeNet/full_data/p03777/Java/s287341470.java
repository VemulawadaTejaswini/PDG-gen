import java.util.Scanner;

public class HonestOrDishonest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = Integer.parseInt(scn.next());
		int b = Integer.parseInt(scn.next());
		int H = Integer.parseInt(scn.next());
		int D = Integer.parseInt(scn.next());
	
		if ( a == H && b == H) 
			System.out.println("H");
		if ( a == H && b == D) 
			System.out.println("D");
		if ( a == D && b == H)
			System.out.println("D");
		if ( a == D && b == D) 
			System.out.println("H");

	}

}