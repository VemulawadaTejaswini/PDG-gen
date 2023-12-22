import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int c = sc.nextInt();
    	      int x = sc.nextInt();
    	      int l, m;
    	      int root = 0;
    	      for(int i=0; i<=a; i++) {
    	    	  l = 500 * i;
    	    	  if(l > x) {
    	    	  break;
    	    	  }
    	    	  for(int j=0; j<=b; j++) {
    	    		  m = l + 100*j;
    	    		  if(m > x) {
    	    			  break;
    	    		  }
    	    		  if((x-m) /50 <= c){
    	    			  root++;
    	    		  }
    	    	  }
    	      }
	      System.out.println(root);
	}
}