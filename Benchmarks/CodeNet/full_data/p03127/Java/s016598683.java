
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for (int i = 0; i < n; i++) {
        	a[i]=sc.nextLong();
		}
        Arrays.sort(a);
        
        int gcd=1;
        
        for(int i=0;i<n;i++) {
        	
        	for(int p=1;p<=a[0];p++) {
        		if(a[0]%p==0&&a[1]%p==0) {
        			gcd=p;
        		}
        	}
        	if(i!=0) {
        		a[i]=a[i]%gcd;
        	}
        	
        }
        Arrays.sort(a);
        System.out.println(a[n-2]==0?gcd:"1");
        
    }
}
