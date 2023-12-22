import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		
		String s = "";
		for(int i = 0; i < S.length()/2; i++) {
			s += "hi";
		}
		if(S.equals(s)) System.out.println("Yes");
		else System.out.println("No");

	}

}