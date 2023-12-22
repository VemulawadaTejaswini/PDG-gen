import java.util.*;
import java.util.Map.Entry;
 
 

class Main {
	 static int mod =  (int) (Math.pow(10,9)+7);
   public static void main(String[] args) {
   
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();

       long[] a = new long[N];
       for (int i=0 ; i<N; i++) {
           a[i] = sc.nextLong();
       }
       
       long[] min = new long[N];
       int cnt=0;
       for(int i=0;i<N;i++) {
    	   int right=cnt;
    	   int left=-1;
    	   while(right-left>1) {
    		   int mid=left+(right-left)/2;
    		   if(min[mid]<a[i]) right=mid;
    		   else left=mid;
    	   }
    	   min[right]=a[i];
    	   cnt=Math.max(cnt, right+1);
       }

    System.out.println(cnt); 	
              		
   }

}