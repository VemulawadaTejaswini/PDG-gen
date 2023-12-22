import java.util.*;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] A = new int[N+1];
       int[] B = new int[N+1];
       int cnt=0;
       for(int i = 0; i<N; i++) {
       	A[i] = sc.nextInt();
       }
       
       for(int i = N-1; i>=0; i--) {
    	   if(A[i]==1) {
			   B[cnt]=i+1;
			   cnt++;
			   A[i]=0;
    		   for(int j=i/2;j>=0;j--) {
    			   if((i+1)%(j+1)==0) {
    				   if(A[j]==0) {
    					   A[j]=1;
    				   }else {
    					   A[j]=0;
    				   }
    			   }
    		   }
    	   }
       }
       
       System.out.println(cnt);
       for(int i=0;i<cnt;i++) {
    	   System.out.print(B[i] + " ");
       }
       
   }
}