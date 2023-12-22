import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		List<Integer> a = new ArrayList<>();
		for(i=0; i<n; i++) {
			a.add(Integer.parseInt(sc.next()));
		}
		Collections.sort(a, Comparator.reverseOrder());
		int b;
		int c;
		for(i = 0; i < m; i++) {
			b = Integer.parseInt(sc.next());
			c = Integer.parseInt(sc.next());
			for(j=0; j<a.size(); j++) {
				if(a.get(j) <= c) {
					for(k=0;k<b;k++) {
						a.add(j, c);
					}
					break;
				}
			}
		}
		sc.close();
		sc = null;
		long sum = 0;
		for(i=0; i<n; i++) {
			sum += a.get(i);
		}
		System.out.println(sum);
	}
}
