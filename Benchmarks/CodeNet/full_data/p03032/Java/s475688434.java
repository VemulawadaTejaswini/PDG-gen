
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		long ans = 0;
		
		for(int k = 0 ; k <= p ; k++) {
			for(int l = 0 ; l <= p ; l++) {
				if(k + l >= Math.min(n, p)) {
					break;
				}
				ArrayList <Integer> list = new ArrayList<Integer>();
				long temp1 = 0;
				for(int i = 0 ; i < k ; i++) {
					list.add(a[i]);
				}
				for(int j = 0 ; j < l ; j++) {
					list.add(a[n-j-1]);
				}
				
				Collections.sort(list);
				int r = p - k - l;
				
				for(int i = 0 ;i < r ;i++) {
					if(list.size() > 0) {
						if(list.get(0) < 0) {
						list.remove(0);
					}
				}
			}
				for(int num : list) {
					temp1 +=(long)num;
				}
				ans = Math.max(ans,temp1);
			}
		}
		System.out.println(ans);
				
	

	}
}
