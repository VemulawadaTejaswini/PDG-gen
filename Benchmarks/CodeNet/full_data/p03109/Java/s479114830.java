import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), q = sc.nextInt();
		
		TreeSet<Long> t = new TreeSet<Long>(),
				s = new TreeSet<Long>();
		
		for (int i=0; i<a; i++) s.add(sc.nextLong());
		for (int i=0; i<b; i++) t.add(sc.nextLong());
		
		for (int i=0; i<q; i++) {
			long pos = sc.nextLong();
			Long tl = t.lower(pos), tr = t.higher(pos), 
					sl = s.lower(pos), sr = s.higher(pos);
			if (tl==null) tl = -1L<<30;
			if (tr==null) tr = 1L<<30;
			if (sl==null) sl = -1L<<30;
			if (sr==null) sr = 1L<<30;
			
			Long min = 1L<<30;
			
			min = Math.min(Math.min(pos - tl, pos - sl), Math.min(tr - pos, sr - pos));
			min = Math.min(min, (pos - tl) + (sr - pos) + Math.min((pos - tl), (sr - pos)));
			min = Math.min(min, (tr - pos) + (pos - sl) + Math.min((tr - pos), (pos - sl)));
			
			
			System.out.println(min);
			
		}
	}
}