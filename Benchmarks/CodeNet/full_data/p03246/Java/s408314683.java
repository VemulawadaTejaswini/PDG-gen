

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int [] a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		Map <Integer,Integer> hm = new HashMap <Integer,Integer>();
		
		for(int i = 0 ; i < n ; i+=2) {
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
			}
			else {
				hm.put(a[i],1);
			}
		}
		int fnum = 0;
		int first = 0;
		int second = 0;
		
		for(int num : hm.keySet()) {
			if(first < hm.get(num)) {
				fnum = num;
				second = first;
				first = hm.get(num);
				}
			else if(second < hm.get(num)) {
				second = hm.get(num);
			}
		}
		
		hm = new HashMap<Integer, Integer>();
		
		for(int i = 1 ; i < n ;i+=2) {
			if(hm.containsKey(a[i])) {
				hm.put(a[i], hm.get(a[i])+1);
			}
			else {
				hm.put(a[i],1);
			}
		}
		
		int first1 = 0;
		int second1 = 0;
		int fnum1 = 0;
		
		for(int num : hm.keySet()) {
			if(first1 < hm.get(num)) {
				fnum1 = num;
				second1 = first1;
				first1 = hm.get(num);
			}
			else if(second1 < hm.get(num)) {
				second1 = hm.get(num);
			}
		}
		
		if(fnum != fnum1) {
			int ans = n - first - first1;
			System.out.println(ans);
		}
		else {
			if(second > second1) {
				int ans = n - first1 - second;
				System.out.println(ans);
			}
			else {
				int ans = n - first - second1;
				System.out.println(ans);
			}
		}

	}

}
