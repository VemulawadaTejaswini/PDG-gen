
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	long N = Long.parseLong(scan.next());
	long K = Long.parseLong(scan.next());

	System.out.println(K * pow(K-1, N-1));
	scan.close();
    }

    private static long pow(long x, long y) {
	if(y == 0) return 1;

	if(y % 2 == 0) {
	    long x2 = pow(x, y/2);
	    return x2 * x2;
	} else {
	    long x2 = pow(x, y/2);
	    return x * x2 * x2;
	}
    }
}
