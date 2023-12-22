import java.util.*;
// warm-up
// Operator precedence of evaluation is not correctly captured in previous solution
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String tok = sc.next();
		int A = Character.getNumericValue(tok.charAt(0)), 
		B = Character.getNumericValue(tok.charAt(1)),
		C = Character.getNumericValue(tok.charAt(2)),
		D = Character.getNumericValue(tok.charAt(3)); 
		if (A-B-C-D==7) System.out.println(A+"-"+B+"-"+C+"-"+D+"=7");
		else if (A-B-C+D==7) System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
		else if (A-B+C+D==7) System.out.println(A+"-"+B+"+"+C+"+"+D+"=7");
		else if (A+B-C-D==7) System.out.println(A+"+"+B+"-"+C+"-"+D+"=7");
		else if (A+B-C+D==7) System.out.println(A+"+"+B+"-"+C+"+"+D+"=7");
		else if (A+B+C-D==7) System.out.println(A+"+"+B+"+"+C+"-"+D+"=7");
		else if (A+B+C+D==7) System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}