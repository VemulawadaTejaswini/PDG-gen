
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		List <Integer> L = new ArrayList <Integer>();
		L.add(a[0]);
		
		for(int i = 1 ; i < n ;i++) {
			Binary_Search(L,a[i]);
		}
		
		System.out.println(L.size());

	}
	
	static void Binary_Search(List<Integer> L , int target) {
		
		int h = L.size()-1;
		int l = 0;
		int mid = (h+l)/2;
		if(L.get(h) < target) {
			L.remove(h);
			L.add(target);
			return;
		}
		if(L.get(l) >= target) {
			L.add(0,target);
			return;
		}
		
		while(h - l > 1) {
			if(L.get(mid) == target) {
				L.add(mid,target);
				L.remove(mid-1);
				return;
			}
			else if(L.get(mid) > target) {
				h = mid;
			}
			else {
				l = mid;
			}
		}
		L.add(h,target);
		L.remove(l);
		return;
	}

}
