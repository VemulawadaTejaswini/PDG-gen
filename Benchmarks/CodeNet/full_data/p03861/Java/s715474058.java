import java.util.*;


public class Main {
	
	Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		new Main().run(); 
	}
	
	public void run() {
		
		long A = cin.nextLong();
		long End = cin.nextLong();
		long X = cin.nextLong();
		
		long r = A % X;
		long Start = r + A;
		
		long res = longDivide(End - Start + 1, X);
		System.out.println(res);
	}
	
	
	/*
	 * d1/ d2
	 */
	public long longDivide(long d1, long d2) {
		if (d2 == 1) {
			return d1;
		}
		
		if (d1 < d2) {
			return 0;
		}
		
		
		long sum = d2;
		long mult = 1;
		
		while (sum + sum <= d1) {
			sum += sum;
			mult += mult;
		}
		
		return mult + longDivide(d1 - sum, d2);
		
	}
}

