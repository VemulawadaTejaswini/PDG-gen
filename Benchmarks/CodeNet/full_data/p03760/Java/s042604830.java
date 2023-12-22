import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E = sc.next();
		for(int i = 0; i < O.length() - 1; i++) {
				char o = O.charAt(i);
				char e = E.charAt(i);
				System.out.print(o);
				System.out.print(e);
		}
		System.out.print(O.charAt(O.length() -1));
		if(E.length() == O.length()) System.out.println(E.charAt(E.length() - 1);
	}
		
}
	
