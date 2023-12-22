import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long A, B, C, D;
		A = Long.parseLong(sc.next()) - 1;
		B = Long.parseLong(sc.next());
		C = Long.parseLong(sc.next());
		D = Long.parseLong(sc.next());
		
		int count = 0;
		long lcm = C * D / gcd(C, D);
		
		long tmpAC = A / C;
		long tmpBC = B / C;
		long tmpAD = A / D;
		long tmpBD = B / D;
		
		long tmpACD = A / lcm;
		long tmpBCD = B / lcm;
		
		long ans = tmpBC - tmpAC + tmpBD - tmpAD - (tmpBCD - tmpACD);
		
		ans = B - (A + 1) + 1 - ans;
		
		
		System.out.println(ans);

	}
	
	private static long gcd(long m, long n) {
		long tmp;
		while (m % n != 0) {
			tmp = n;
			n = m % n;
			m = tmp;
		}
		return n;
	}

}
