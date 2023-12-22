
import java.util.*;
 
class Main {
	  static long mod=1_000_000_007;
  public static void main(String[] args) {
	  int flg = 0;
	  Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      long M = sc.nextLong();
      Integer[] a = new Integer[(int)N];
      for (int i=0 ; i<N; i++) {
          a[i] = sc.nextInt();
      }
      Arrays.sort(a, Comparator.reverseOrder());
      
      int cnt;
      long tmp;
      for(int i=0;i<M;i++) {
    	  cnt=0;
    	  a[0]=a[0]/2;
    	  tmp = a[0];
    	  for(int j=1;j<N;j++) {
    		  if(a[j]>a[0]) {
    			  cnt++;
    		  }
    	  }
    	  
    	  for(int j=1;j<M-1;j++) {
        	  if(tmp<=a[j] && i<M-1) {
        		  a[j]=a[j]/2;
        		  i=i+1;
        	  } else {
        		  break;
        	  }
    	  }
    	  
          Arrays.sort(a, Comparator.reverseOrder());
    	  
//    	  for(int j=1;j<cnt+1;j++) {
//    		  a[j-1]=a[j];
//    	  }
//    	  a[cnt]=tmp;
      }
      
      long ans=0;
      for(int i=0;i<N;i++) {
          System.out.println(a[i]);
    	  ans = ans + a[i];
      }
      
      System.out.println(ans);
      
  }
}