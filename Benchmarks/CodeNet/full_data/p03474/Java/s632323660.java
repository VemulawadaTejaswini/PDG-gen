import java.util.Scanner;

public class Main{
	static boolean check(String s, int A) {
		if(s.charAt(A) != '-') return false;
		String before = s.substring(0, A);
		String after = s.substring(A + 1);
		for(int i = 0; i < before.length(); i++) {
			if(!Character.isDigit(before.charAt(i))) return false;
		}
		for(int i = 0; i < after.length(); i++) {
			if(!Character.isDigit(after.charAt(i))) return false;
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt();
		String S = sc.next();
		System.out.println(check(S, A) ? "Yes" : "No");
	}
}
