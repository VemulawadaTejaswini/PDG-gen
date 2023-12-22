import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		String head = S.substring(0,2);
		String tail = S.substring(2);
		
		if(isMM(head) && isMM(tail)) System.out.println("AMBIGUOUS");
		else if(isMM(tail)) System.out.println("YYMM");
		else if(isMM(head)) System.out.println("MMYY");
		else System.out.println("NA");
		
	}
	
	private boolean isMM(String xx) {
		int target = Integer.parseInt(xx);
		if(1<=target && target<=12) return true;
		return false;
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}
