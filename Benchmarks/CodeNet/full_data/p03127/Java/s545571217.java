
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
        for(int i=1;i<n;i++) {
        	while(a[i]!=a[i-1]) {
        		
        	
        		if(a[i]>a[i-1]) {
        			
        			a[i]=a[i]%a[i-1]==0?a[i-1]:a[i]%a[i-1];
        		}
        		else if(a[i]<a[i-1]) {
        			a[i-1]=a[i-1]%a[i]==0?a[i]:a[i-1]%a[i];
        		}
        			
        		
        	}	
        }
        
        
        System.out.println(a[n-1]);
        
    }
}
