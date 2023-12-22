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
		int n = parseInt(sc.next());
		int tmp;
		HashMap<Integer, Integer> l = new HashMap<>();
		for(i=0;i<n;i++) {
			tmp = parseInt(sc.next());
			if(l.get(tmp) == null) {
				l.put(tmp, 1);
			} else {
				l.put(tmp, l.get(tmp)+1);
			}
		}
		sc.close();
		ArrayList<Integer> list = new ArrayList<>(l.values());
		Collections.sort(list, Comparator.reverseOrder());
		PrintWriter pw = new PrintWriter(out);
		pw.println(n);
		for (i = 2; i <= l.size(); i++) {
			int cnt=0;
			cnt += list.size() / i;
			int pt = l.size()-1;
			for (j = 2; j < n; j++) {
				while(pt+1>=j) {
					if(list.get(pt)>=i)break;
					pt--;
				}
				if(pt+1<j)break;
				cnt+=(pt+1)/i;
			}
			pw.println(cnt);
		}
		for (i = l.size()+1; i <= n ; i++) {
			pw.println(0);
		}
		pw.flush();;
	}
}
