import java.util.*;

import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int m = parseInt(sc.next());
		int[] a = new int[n];
		int[] b = new int[n];
		HashMap<Integer, ArrayList<Integer>> ab = new HashMap<>();
		for(i=0;i<n;i++) {
			a[i] = parseInt(sc.next());
			b[i] = parseInt(sc.next());
			if(!ab.containsKey(a[i])) {
				ab.put(a[i], new ArrayList<Integer>());
			}
			ab.get(a[i]).add(b[i]);
		}
		sc.close();
//		out.println(ab.keySet());
		for(Integer ii : ab.keySet()) {
			ab.get(ii).sort(Comparator.reverseOrder());
//			out.println(ab.get(ii).toString());
		}
		ArrayList<Integer> abl = new ArrayList<>();
		for(i=1;i<=m;i++) {
			if(!ab.containsKey(i))continue;
//			out.printf("%d:%d%n",i,ab.get(i).size());
			abl.addAll(ab.get(i).subList(0, Math.min(m-i+1,ab.get(i).size())));
//			out.printf("%d:%s%n",i,ab.get(i).subList(0, Math.min(m-i+1,ab.get(i).size())).toString());
		}
		abl.sort(Comparator.reverseOrder());
//		out.println(abl.toString());
		int ans=0;
		for(i=0;i<Math.min(m,abl.size());i++) {
			ans += abl.get(i);
		}
		out.println(ans);
	}
}
