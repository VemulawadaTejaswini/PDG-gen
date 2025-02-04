package shojin016;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		List<List<Integer>> alp = new ArrayList<>();
		
		for(int i = 0 ; i < 26 ;i++) {
			alp.add(new ArrayList<>());
		}
		
		for(int i = 0 ;i < s.length() ;i++) {
			int id = s.charAt(i)-'a';
			alp.get(id).add(i);
		}
		
		
		for(int i = 0 ; i < t.length(); i++) {
			int p = t.charAt(i)-'a';
			if(alp.get(p).isEmpty()) {
				System.out.println(-1);
				return;
			}
		}
		
		int f = -1;
		int len = 1;
		
		for(int i = 0 ; i < t.length() ; i++) {
			int p = t.charAt(i)-'a';
			int q = binary_search(alp.get(p),f);
			if(q == -1) {
				len++;
				f = alp.get(p).get(0);
			}
			else {
				f = q;
			}			
		}
		
		long ans = (long)(len-1) * s.length() + f+1;
		System.out.println(ans);
		

	}
	
	static int binary_search(List<Integer> alp, int f) {
		
		int l = 0;
		int r = alp.size()-1;
		int mid =(l+r)/2;
		
		
		if(alp.get(r) <= f) {
			return -1;
		}
		if(alp.get(0) > f) {
			return alp.get(0);
		}
		
		while(r-l > 1) {
			mid = (l+r)/2;
			
			if(alp.get(mid) > f) {
				r = mid; 
			}
			else if(alp.get(mid) < f) {
				l = mid;
			}
			else {
				return alp.get(mid+1);
			}
		}
		return alp.get(r);
		
	}
	
}
