import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		char[] c = S.toCharArray();
		for(int i = 0; i < 3; i++) {
			if(c[i] == c[i+1]) {
				System.out.println("Bad");
				System.exit(0);
			}
		}
		System.out.println("Good");

	}

}