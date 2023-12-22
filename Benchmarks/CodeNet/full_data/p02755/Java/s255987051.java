import java.util.*;

class Main {
	Scanner sc;
	int A, B;
	
	private void calc() {
		sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		
		System.out.println(sub());
	}
	
	private int sub() {
		double amin = A/0.08;
		double amaxe = (A+1)/0.08;
		
		double bmin = B/0.1;
		double bmaxe = (B+1)/0.1;
		
		if (amin >= bmaxe) return -1;
		if (bmin >= amaxe) return -1;
		
		double min = Math.max(amin, bmin);
		double max = Math.min(amaxe, bmaxe);
		if (min == (int)min) min--;
		if (max == (int)max) max--;
		
		if ( (int)(min+1) > (int)max ) return -1;
		
		return (int)(min+1);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
