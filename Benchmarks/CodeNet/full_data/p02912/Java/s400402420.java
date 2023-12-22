import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.System.*;

public class Main {
	public static int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		Integer[] a = new Integer[n];
		long sum = 0;
		int aa = 0;
		for(i=0;i<n;i++) {
			aa = parseInt(sc.next());
			sum += (long)aa;
			a[i] = aa;
		}
		sc.close();
		Arrays.sort(a, Comparator.reverseOrder());
		ArrayList<Integer> dif = new ArrayList<>();
		for (i = 1; i <= 31; i++) {
			int tmp=0;
			int tmp2=0;
			for (j = 0; j < a.length; j++) {
				tmp2 = a[j] >> 1;
				tmp = a[j] - tmp2;
				if(tmp == 0) break;
				a[j] = tmp2;
				dif.add(tmp);
			}
			if(j==0) break;
		}
		Collections.sort(dif, Comparator.reverseOrder());
		long dsum = 0;
		for (i = 0; i < Math.min(m, dif.size()); i++) {
			dsum += (long)dif.get(i);
		}
		out.println(sum - dsum);
	}
}
