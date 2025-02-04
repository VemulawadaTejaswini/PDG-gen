import java.util.*;
import java.io.*;

class Main {

	void solve() {
		
		int n = inint(), m = inint();
		Answer[] answers = new Answer[m];
		for (int i=0; i<m; i++) {
			answers[i] = new Answer(inint(), instr());
		}
		
		boolean[] isEnd = new boolean[n];
		int ACcount = 0;
		int WAcount = 0;
		
		for (int i=m-1; i>=0; i--) {
			
			if (isEnd[answers[i].number - 1] == false) {
				if (answers[i].result.equals("AC")) {
					ACcount++;
					isEnd[answers[i].number - 1] = true;
				}
			}
			else {
				if (answers[i].result.equals("WA")) {
					WAcount++;
				}
			}
			
		}
		
		
		out.println(ACcount + " " + WAcount);
		
	}
	
	public double calc(int[] a, int b) {
		double d = 0;
		for (int i=0; i<a.length; i++) d += a[i];
		d += b;
		return d / (double)(a.length + 1);
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

class Answer {
	public Answer(int number, String result) {
		this.number = number;
		this.result = result;
	}
	int number;
	String result;
}