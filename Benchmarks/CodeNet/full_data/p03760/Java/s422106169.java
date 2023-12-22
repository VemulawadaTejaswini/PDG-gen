import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		String O=in.nextLine(),E=in.nextLine();
		
		for(int i=0;i<O.length();i++) {
			System.out.print(O.charAt(i));
			if(i<E.length())System.out.print(E.charAt(i));
		}
		System.out.println();
	}

}
