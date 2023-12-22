import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main{
	
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long [] ss = new long[n];
        for(int i=0;i<n;i++) {
        	a[i] = sc.nextLong();
        	b[i] = sc.nextLong();
        	ss[i] = a[i] + b[i];
        }
        
        long t = 0l;
        long o = 0l;
        
        HashMap<Long, Integer> s = new HashMap<>();
        for(int i=0;i<n;i++) {
        	s.put(ss[i], i);
        }
        Arrays.sort(ss);
        
        for(int i=n-1;i>=0;i--) {
        	int j = s.get(ss[i]);
        	if(((n-1)-i)%2 == 0) {
        		t += a[j];
        	}else {
        		o += b[j];
        	}
        }
        System.out.println((long)(t - o));
    }
}
