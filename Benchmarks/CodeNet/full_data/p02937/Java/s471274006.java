import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray(), q = in.next().toCharArray();
		long i = 0;

		Map<Character, list> alf = new HashMap<>();

		for(int j = 0; j < s.length; j++) {
			if(alf.containsKey(s[j])) {
				alf.get(s[j]).add(j);
			}else {
				alf.put(s[j], new list(j));
			}
		}
		for(int j = 0; j < q.length; j++) {
			if(!alf.containsKey(q[j])) {
				System.out.println(-1);
				return;
			}
		}

		int lim = 0;
		int qInd = 0;
		int back = 0;
		while(lim < 100 && qInd < q.length) {
			int sInd = alf.get(q[qInd]).getNow();
			i += sInd - back;
			if(sInd < back) {
				i += s.length;
				lim++;
			}
			back = sInd;
			qInd++;
		}

		if(lim == 100 || qInd >= q.length) {
			System.out.println(-1);
		}else {
			System.out.println(i);
		}
		return;
	}
}

class list{
	ArrayList<Integer> ind = new ArrayList<Integer>();
	int now;
	public list(int n) {
		ind.add(n);
		now = 0;
	}

	public void add(int n) {
		ind.add(n);
	}

	public int getNow() {
		if(now >= ind.size())
			now = 0;
		int re = ind.get(now)+1;
		now++;
		return re;

	}

}