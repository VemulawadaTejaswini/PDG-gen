
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		List<Integer> a = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int v = sc.nextInt();
			m.put(v, m.containsKey(v) ? m.get(v)+1 : 1);
			a.add(v);
		}
		Collections.sort(a);
		a = a.stream().distinct().collect(Collectors.toList());

		long ans = 0;
		for(int i=0; i<a.size(); i++) {
			long tmp = m.get(a.get(i));
			if(i>0 && a.get(i)-a.get(i-1)<=1) {
				tmp += m.get(a.get(i-1));
			}
			if(i<a.size()-1 && a.get(i+1)-a.get(i)<=1) {
				tmp += m.get(a.get(i+1));
			}
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
		sc.close();
	}





}
