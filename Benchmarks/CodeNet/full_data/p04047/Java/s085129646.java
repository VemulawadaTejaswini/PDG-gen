import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] l = new int[2*n];
		for (i = 0; i < l.length; i++) {
			l[i] = parseInt(sc.next());
		}
		sc.close();
		Arrays.parallelSort(l);
		int cnt = 0;
		for (i = 0; i < n; i++) {
			cnt += Math.min(l[i*2], l[i*2+1]);
		}
		out.println(cnt);
	}
}
