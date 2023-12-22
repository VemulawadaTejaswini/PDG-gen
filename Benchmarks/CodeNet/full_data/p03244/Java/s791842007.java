import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int v[] = new int[n];
		for(int i=0; i<n; i++) {
			v[i]=sc.nextInt();
		}

		Map<Integer, Integer> e = new HashMap<Integer,Integer>();
		Map<Integer, Integer> o = new HashMap<Integer,Integer>();

		for(int i=0; i<n; i++) {
			if(i%2==0) {
				int c = e.containsKey(v[i]) ? e.get(v[i]) : 0;
				e.put(v[i], c+1);
			}else {
				int c = o.containsKey(v[i]) ? o.get(v[i]) : 0;
				o.put(v[i], c+1);
			}
		}

		e.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
		o.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

		int ek1=-1;
		int ev1=-1;
		int ev2=0;

		int ok1=-1;
		int ov1=-1;
		int ov2=0;

		for(Entry<Integer,Integer> s : e.entrySet()) {
			if(ek1==-1) {
				ek1=s.getKey();
				ev1=s.getValue();
			}else {
				ev2=s.getValue();
				break;
			}
		}

		for(Entry<Integer,Integer> s : o.entrySet()) {
			if(ok1==-1) {
				ok1=s.getKey();
				ov1=s.getValue();
			}else {
				ov2=s.getValue();
				break;
			}
		}

		int ans = Integer.MAX_VALUE;
		if(ek1!=ok1) {
			ans = n-ev1-ov1;
		} else {
			ans = Math.min(n-ev1-ov2, n-ev2-ov1);
		}
		System.out.println(ans);

		sc.close();
	}
}
