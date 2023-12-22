import java.util.*;

public class  TorT {
 	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
      	int N = sc.nextInt();
     	int train = A*N ;
      	if (train <= B) {
        	System.out.println (train);  
        } else {
         	System.out.println (B);
        }
 	}
}