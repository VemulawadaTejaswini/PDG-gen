import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			long n = in.nextLong();

			long r = 0;
			long d = 0;
			
			long end = (long)Math.sqrt(n) + 1;
			while (d <= end) {
				d++;
				
				long x = (n - d);
				if (x % d == 0) {
					long f = x / d;
					if (d % f == 0 || d > f) {
						continue;
					}
					//System.out.println(f);
					r += f;
				}
				
			}
			
			System.out.println(r);
		}
	}
	
}
