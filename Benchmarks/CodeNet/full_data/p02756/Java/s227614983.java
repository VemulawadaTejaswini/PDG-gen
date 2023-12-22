import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int q = in.nextInt();
		int[] query = new int[q];
		ArrayList<Integer> f = new ArrayList<Integer>();
		ArrayList<String> c = new ArrayList<String>();
		int count = 0;
		
		for (int i=0; i<q; i++) {
			query[i] = in.nextInt();
			if (query[i] == 2) {
				int ftemp = in.nextInt();
				f.add(ftemp);
				String ctemp = in.next();
				c.add(ctemp);
			}
		}
		
		for (int i=0; i<q; i++) {
			if (query[i] == 1) {
				StringBuilder sb = new StringBuilder(s);
				s = sb.reverse().toString();
			}
			if (query[i] == 2 ) {
				if (f.get(count) == 1) {
					s = c.get(count) + s;
				}
				if (f.get(count) == 2) {
					s = s + c.get(count);
				}
				count++;	
			}
		}
		System.out.println(s);
		
	}
}
