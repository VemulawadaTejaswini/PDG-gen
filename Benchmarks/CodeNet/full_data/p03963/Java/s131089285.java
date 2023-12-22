import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int N = scan.nextInt();
        int K = scan.nextInt();
        long cnt = 0;
        
        cnt = (long)(K*Math.pow( (K-1) , N-1 ));
        
        System.out.println(cnt);
	  }
}