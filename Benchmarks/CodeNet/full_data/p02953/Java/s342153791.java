import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int Ans = 0;
      int flg = 0;
      int N = sc.nextInt();
      int[] a = new int[N];
      for (int i=0 ; i<N; i++) {
          a[i] = sc.nextInt();
      }
      
      for(int i=1; i<N; i++) {
    	  if(a[i-1]>a[i]) {
    		  if(a[i-1]-1==a[i]) {
    			  if (flg==0) {
    				  flg = 1;
    			  } else {
    				  Ans = 1;
    				  break;
    			  }
    		  } else {
    			  Ans = 1;
    			  break;
    		  }
    	  } else {
    		  flg = 0;
    	  }
      }
      if (Ans == 0) {
    	  System.out.println("Yes");
      } else {
    	  System.out.println("No");
      }
      
  }  
}