import java.util.Scanner;

class Main {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String[] S = new String[3];

	    for (int i = 0; i < 3; i++) {
	    	S[i] = sc.next();
	    }

	    if (S[0].equals(S[1]) && S[0].equals(S[2])) {
	    	System.out.println("No");
	    } else {
	    	System.out.println("Yes");
	    }
	}
}