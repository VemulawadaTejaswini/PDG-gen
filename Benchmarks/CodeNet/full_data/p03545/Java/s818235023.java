import java.util.*;
// warm-up
// Missed one pattern
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String[] t = {"000","001","010","011","100","101","110","111"};
		String tok = sc.next();
		int A = Character.getNumericValue(tok.charAt(0)), 
		B = Character.getNumericValue(tok.charAt(1)),
		C = Character.getNumericValue(tok.charAt(2)),
		D = Character.getNumericValue(tok.charAt(3)); 
		for (String e : t) {
			int s = 0;
			StringBuilder sb = new StringBuilder();
			s+=e.charAt(0)=='1' ? A+B : A-B;
			s+=e.charAt(1)=='1' ? C : -C;
			s+=e.charAt(2)=='1' ? D : -D;
			if (s==7) {
				sb.append(A).append(e.charAt(0)=='1' ? "+" : "-").append(B)
				.append(e.charAt(1)=='1' ? "+" : "-").append(C)
				.append(e.charAt(2)=='1' ? "+" : "-").append(D);
				System.out.println(sb+"=7");
				System.exit(0);
			}
		}
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}