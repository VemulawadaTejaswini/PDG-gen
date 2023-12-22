import java.util.Scanner;

public class  Main{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		
		
		long a[] = new long[3];
		long b[] = new long[3];
		long c[] = new long[3];
		
		a[0] = 0;
		b[0] = 0;
		c[0] = 0;
		a[1] = A;
		b[1] = B;
		c[1] = C;
		a[2] = A;
		b[2] = B;
		c[2] = C;
		
		if(A == B && B == C)			System.out.println(a[2] - b[2]);
		else {
		
		for(int i = 1; i <= K; i++) {
			a[2] = a[0] + b[1] + c[1];
			b[2] = b[0] + a[1] + c[1];
			c[2] = c[0] + a[1] + b[1];
			
			a[0] = a[2];
			b[0] = b[2];
			c[0] = c[2];
			
			a[1] = a[1];
			b[1] = b[1];
			c[1] = c[1];
			
			//System.out.println(a[2] + " " + b[2] + " " + c[2]);
		}
		
		System.out.println(a[2] - b[2]);
		}
	}
}
