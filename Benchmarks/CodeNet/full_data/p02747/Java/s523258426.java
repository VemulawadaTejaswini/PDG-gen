import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    char[] s = S.toCharArray();

	    boolean flg = false;
	    for (int i = 0; i < s.length; i++) {
	    	if (s[i] == 'h' && s[i+1] == 'i' && s[i+2] != 'i') {
	    		flg = true;
	    		break;
	    	}
	    }

	    if (flg) {
	    	System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
	}

}