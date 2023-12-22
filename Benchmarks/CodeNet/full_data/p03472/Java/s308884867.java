import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long h = Long.parseLong(sc.next());
		long count = 0;
		int idx = 0;
		long[] a = new long[n];
		long[] b = new long[n];
		long amax = 0;
		for(int i=0; i<n; i++) {
		    a[i] = Long.parseLong(sc.next());
		    b[i] = Long.parseLong(sc.next());
		    if(a[i] > amax) {amax = a[i]; idx = i;}
		}
		
		long listsum = 0;
		ArrayList<Long> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
		    if(i == idx) {continue;}
		    if(b[i] > amax) {list.add(b[i]); listsum += b[i];}
		}
		
		if(h > listsum+b[idx]) {
		    h -= listsum;
		    count += list.size();
		}else {
    		Collections.sort(list, Collections.reverseOrder());
    		for(long x : list) {
    		    if(h - b[idx] <= 0) {count++; break;}
                else {count++; h -= x;}
                if(h <= 0) break;
            }
		}
        if(((h-b[idx]) % amax) == 0) count += (h-b[idx]) / amax + 1;
        else count += (h-b[idx]) / amax + 2; 
        /*
        while(h > 0) {
            if(h - b[idx] <= 0) {count++; break;}
            else h -= amax;
            count++;
        }
        */
		
		System.out.println(count);
	}
	
}
