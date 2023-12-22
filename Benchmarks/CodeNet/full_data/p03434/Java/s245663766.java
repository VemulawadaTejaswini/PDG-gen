import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.parseLong;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		Integer[] a = new Integer[n];
		for (i = 0; i < n; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(a, Collections.reverseOrder());
		int[] ab = new int[2];
		for (i = 0; i < n; i++) {
			ab[i%2] += a[i];
		}
		out.println(ab[0]-ab[1]);
	}
}
