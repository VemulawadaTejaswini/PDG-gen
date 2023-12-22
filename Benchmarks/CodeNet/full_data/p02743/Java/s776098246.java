import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		long a=scan.nextInt(),b=scan.nextInt();
		long c=scan.nextInt();
		if(longSqrt(a)+longSqrt(b) < longSqrt(c)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
 	}

    private static long longSqrt (long a) {
        long b = (long)Math.sqrt(a);
        if(b*b > a) {
            b--;
        }
        return b;
    }

}