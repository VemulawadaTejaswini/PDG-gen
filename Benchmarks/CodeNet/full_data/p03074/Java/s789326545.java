import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		int max = 0;
		char b = '1';
		int len = 0;
		int[] l = new int[10000];
		l[len] = 0;
		len++;
		for(int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if(b != c) {
				l[len] = i;
				len++;
				b = c;
			}
		}
		l[len] = n;
		len++;
		int idx = 0, d = 2 * k + 1;
		//System.out.println(Arrays.toString(l.toArray()));
		while(idx + d < len) {
			int x = l[idx + d] - l[idx];
			if(max < x) max = x;
			idx += 2;
			//System.out.println(max);
		}
		if(max == 0 && k != 0) max = n;
		System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
