
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	long a = Long.parseLong(scan.next());
	long b = Long.parseLong(scan.next());
	long x = Long.parseLong(scan.next());

	long ans = 0;
	long q = a / x;
	long min = (a % x == 0 ? q * x : (q+1) * x);
	if(min <= b) {
	    ans++;
	    ans += (b-min) / x;
	}
	    
	System.out.println(ans);
	scan.close();
    }
}
