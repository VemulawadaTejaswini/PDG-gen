import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long L = sc.nextLong();
		
		SortedSet<String> sorted = new TreeSet<String>(new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length())
					return s1.compareTo(s2);
				else
					return - (s1.length() - s2.length());
			}
		});
		
		for(int i=0; i<N; i++) {
			String s = sc.next();
			add(sorted, s);
		}
	
		long xor=0;
		while(! sorted.contains("")) {
			String s = sorted.first();
			
			String rev = revTail(s);
			
			xor ^= (((L - rev.length())%2)+1);
			add(sorted, rev);
		}
		
		System.out.println(xor==0 ? "Bob" : "Alice");
		sc.close();
	}
	
	static void add(Set<String> set, String s) {
		while(s.length()>0) {
			String rev = revTail(s);
			if(set.contains(rev)) {
				set.remove(rev);
				s = s.substring(0, s.length()-1);
			} else {
				break;
			}
			
		}
		set.add(s);
	}
	
	static String revTail(String s) {
		int M = s.length();
		if(M==0)
			return s;
		return s.substring(0, M-1) + (s.charAt(M-1)=='0' ? "1" : "0");
	}
}
