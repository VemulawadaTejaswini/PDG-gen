import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		String[] w = new String[n];
		HashMap<String, Integer> hm = new HashMap<>();
		for(i=0;i<n;i++) {
			w[i] = sc.next();
			if(hm.containsKey(w[i])) {
				hm.put(w[i], hm.get(w[i])+1);
			} else {
				hm.put(w[i], 1);
			}
		}
		sc.close();
		boolean f=true;
		ArrayList<Integer> list = new ArrayList<>(hm.values());
		Collections.sort(list, Comparator.reverseOrder());
		if(list.get(0)>1) {
			f=false;
		} else {
			for(i=0;i<n-1;i++) {
				if(w[i].charAt(w[i].length()-1) != w[i+1].charAt(0)) {
					f=false;
					break;
				}
			}
		}
		out.println(f?"Yes":"No");
	}
}
