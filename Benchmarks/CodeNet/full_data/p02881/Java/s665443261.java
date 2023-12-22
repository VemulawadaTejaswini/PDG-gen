import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		long n = parseLong(sc.next());
		sc.close();
		for (i = (int) sqrt(n); i >= 1; i--) {
			if(n%i==0)break;
		}
		out.println((i-1)+(n/i-1));
	}
}
