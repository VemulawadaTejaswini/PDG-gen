
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner Hen = new Scanner( System.in);
		int N ,H,W;
            
            N=Hen.nextInt() ;
            H=Hen.nextInt() ;
            W=Hen.nextInt() ;
            
           
        System.out.println((N-H+1)*(N-W+1));
	}
}