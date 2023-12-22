import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		
		System.out.println(Main.numOfdeviable(a, b, x));
		sc.close();
	}

	static long numOfdeviable(long a, long b, long x) {
		long count = 0;
		
		if ( x == 1) {
			for (long i = a; i <= b; i++)
				count = b - a + 1;
		}
		
		else {
			long low = (a / x);
			if (a < x) {
				low = (a / x) + 1;
			}
			
			long high = b / x;
			//System.out.println("low = " + low);
			//System.out.println("high = " + high);
			
			if ( (low == high) && (a % x != 0) )
				return 0;
			count = high - low + 1;
		}
		
		return count;
	}
}
