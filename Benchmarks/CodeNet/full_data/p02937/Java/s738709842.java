
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		List<List<Integer>> alf = new ArrayList<>();
		
		for(int i = 0 ; i < 26 ;i++) {
			alf.add(new ArrayList<>());
		}
		
		for(int i = 0 ;i < s.length() ;i++) {
			int id = s.charAt(i)-'a';
			alf.get(id).add(i);
		}
		
		
		for(int i = 0 ; i < t.length(); i++) {
			int p = t.charAt(i)-'a';
			if(alf.get(p).isEmpty()) {
				System.out.println(-1);
				return;
			}
		}
		
		int f = 0;
		int len = 1;
		
		for(int i = 0 ; i < t.length() ; i++) {
			int p = t.charAt(i)-'a';
			int q = binary_search(alf.get(p),f);
			
			if(q == -1) {
				len++;
				f = alf.get(p).get(0);
			}
			else {
				f = q;
			}			
		}
		
		long ans = (long)(len-1) * s.length() + f+1;
		System.out.println(ans);
		

	}
	
	static int binary_search(List<Integer> alf, int f) {
		
		int l = 0;
		int r = alf.size()-1;
		int mid =(l+r)/2;
		
		
		if(alf.get(r) < f) {
			return -1;
		}
		if(alf.get(0) > f) {
			return alf.get(0);
		}
		
		while(r-l > 1) {
			mid = (l+r)/2;
			
			if(alf.get(mid) > f) {
				r = mid; 
			}
			else {
				l = mid;
			}
		}
		return alf.get(r);
		
	}
	


}
