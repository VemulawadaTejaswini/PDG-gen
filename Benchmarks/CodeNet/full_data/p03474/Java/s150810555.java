import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private int A;
    private int B;
    private String S;

    public Main() {
	A = Integer.parseInt(scan.next());
	B = Integer.parseInt(scan.next());
	S = scan.next();

	scan.close();
    }

    public final void answer() {

	String ans = "Yes";

	for (int i = 0; i < A+B+1; i++) {

	    if(i == A) {
		if(S.charAt(i) != '-') {
		    ans = "No";
		    break;
		}
		
	    } else {
		int d = S.charAt(i) - '0';
		if(d < 0 || d > 9) {
		    ans = "No";
		    break;
		}
	    }
	}

	System.out.println(ans);
	
    }
}
