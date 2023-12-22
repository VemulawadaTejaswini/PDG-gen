import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n];
		HashMap<Integer, Long> b = new HashMap<>();
		for (i = 0; i < n; i++) {
			a[i] = parseInt(sc.next());
			if(b.get(a[i])==null) {
				b.put(a[i], 1L);
			} else {
				b.put(a[i], b.get(a[i])+1L);
			}
		}
		sc.close();
		long sumAll=0;
		for (Integer ii : b.keySet()) {
			sumAll+=b.get(ii)*(b.get(ii)-1);
		}
		PrintWriter pw = new PrintWriter(System.out);
		for(i = 0; i < n; i++) {
			pw.println((sumAll-2*(b.get(a[i])-1))/2);
		}
		pw.flush();
	}
}
