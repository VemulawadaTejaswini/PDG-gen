import java.util.*;

public class Main {
	
	/*
	 * default function
	 * */	
	int ni() {
		return cin.nextInt();
	}
	
	long nl() {
		return cin.nextLong();
	}
	
	String line() {
		return cin.nextLine();
	}
	
	void println(String str) {	
		System.out.println(str);
	}
	
	void print(String str) {
		System.out.print(str);
	}
	
	/*
	 * default variable
	 */
	
	static final int MOD = 1000000007;
	
	Scanner cin = new Scanner(System.in);	
	String  output;
	
	public static void main(String[] args) {			
		new Main().run();						
	}
	
	/* default above */		
	public void run() {
			
		input();
		/* 
		 * start
		 */	
		
		solve();
		
		/*
		 * finish
		 */
		
		
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int X, Y;
	
	void input() {
		
		X = ni();
		Y = ni();
	}
	
	void solve() {
		
		if (Math.abs(X-Y) <= 1) {
			output = "Brown";
		} else {
			output = "Alice";
		}
	}
	
}
