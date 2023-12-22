import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		int max = 0;
		int b = 1;
		LinkedList<Integer> l = new LinkedList<Integer>();//idx
		l.add(0);
		for(int i = 0; i < n; i++) {
			if(b != Integer.parseInt(s.substring(i, i + 1))) {
				l.add(i);
				b = (b + 1) % 2;
			}
		}
		l.addLast(n);
		int idx = 0, d = 2 * k + 1;
		//System.out.println(Arrays.toString(l.toArray()));
		while(idx + d < l.size()) {
			int x = l.get(idx + d) - l.get(idx);
			if(max < x) max = x;
			idx += 2;
			//System.out.println(max);
		}
		if(max == 0) max = n;
		System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
