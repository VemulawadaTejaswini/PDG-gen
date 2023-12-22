import java.util.*;
import java.math.BigInteger;
import static java.lang.System.*;
import java.util.*;
import java.math.BigInteger;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;
		if (N > 1) {
			count += (N * (N-1)) / 2;
		}
		if(M > 1) {
			count += (M * (M-1))/ 2;
		}
		out.print(count);
;
	}
}
