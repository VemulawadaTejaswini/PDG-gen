import java.util.Scanner;

class Main{
	static int f(String SA, String SB, String SC, int c) {
		if(c == 1) {
			if(SA.length() == 0) return 1;
			int next = (SA.charAt(0) == 'a') ? 1 : (SA.charAt(0) == 'b') ? 2 : 3;
			return f(SA.substring(1), SB, SC, next);
		}else if(c == 2) {
			if(SB.length() == 0) return 2;
			int next = (SB.charAt(0) == 'a') ? 1 : (SB.charAt(0) == 'b') ? 2 : 3;
			return f(SA, SB.substring(1), SC, next);
		}else {
			if(SC.length() == 0) return 3;
			int next = (SC.charAt(0) == 'a') ? 1 : (SC.charAt(0) == 'b') ? 2 : 3;
			return f(SA, SB, SC.substring(1), next);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String SA = sc.next(), SB = sc.next(), SC = sc.next();
		int win = f(SA, SB, SC, 1);
		System.out.println(win == 1 ? "A" : win == 2 ? "B" : "C");
	}
}