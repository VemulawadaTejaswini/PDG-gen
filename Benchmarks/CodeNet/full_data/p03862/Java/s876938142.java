import java.util.*;
import java.util.Map.Entry;
 
 
 class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
	 static List<ArrayList<Integer>>  list = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long x = sc.nextLong();
        
        long[] a = new long[N];
        for(int i=0;i<N;i++) {
        	a[i]=sc.nextLong();
        }
        
        long s;
        long sum=0;
        for(int i=0;i<N-1;i++) {
        	s=a[i]+a[i+1]-x;
        	if(s>0) {
        		if(s<a[i+1]) {
        			a[i+1]=a[i+1]-s;
        		} else {
        			a[i+1]=0;
        		}
        		sum=sum+s;
        	}
        }
        System.out.println(sum);        	
                		
    }

}