import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E = sc.next();
		for(int i = 0; i < E.length(); i++) {
			char o = O.charAt(i);
			char e = E.charAt(i);
			System.out.print(o);
			System.out.print(e);
		}
	}
		

}

