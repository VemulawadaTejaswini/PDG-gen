import java.util.*;
import java.io.*;

class Main {

	void solve() {
		
		out.println(isPalindrome(instr())==true ? "Yes" : "No");
		
	}
	
	static boolean isPalindrome (String s) {
		int n = s.length();
		for (int i=0; i<n/2; i++) {
			if (s.charAt(i)!=s.charAt(n-i-1)) {return false;}
		}
		return true;
	}

	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

	public int inint() {
		return in.nextInt();
	}

	public long inlong() {
		return in.nextLong();
	}
	
	public String instr() {
		return in.next();
	}

	public char inchar() {
		return in.next().charAt(0);
	}
	
	public int[] inintar(int num) {
		int[] a = new int[num];
		for (int i=0; i<num; i++) {
			a[i] = in.nextInt();
		}
		return a;
	}

	public char[] incharar() {
		return in.next().toCharArray();
	}

}