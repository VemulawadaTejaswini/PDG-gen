import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);		
		int N = in.nextInt();
        int M = in.nextInt();
        int K = 0;
      
        K = (Math.abs(N-M));
        if(K%2==0){System.out.print((K/2)+N);}
        else{System.out.print("IMPOSSIBLE");}
      
      

        
      }
	}