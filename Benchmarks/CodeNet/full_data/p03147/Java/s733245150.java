import java.util.*;

public class Main {
	  public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int h[] = new int[n];
	    int sum = 0;
	    int end = 0;
	    int w = 0;
	    for(int i=0; i<n; i++) {
	      h[i] = sc.nextInt();
	    }
	    while(end <= n){
	      end = 0;
	  	  for(int i=0; i<n; i++){
	        if(h[i] == 0){
	          end++;
	        }else{
	          w = i;
	          break;
	        }
	      }
	      if(end >= n){
	        break;
	      }
	      while(w < n){
	        if(h[w] <= 0){
	          break;
	        }else{
	          h[w]--;
	        }
	        w++;
	      }
	      sum++;
	    }
	    System.out.println(sum);
	  }
}