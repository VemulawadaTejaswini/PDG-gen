import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		B = 2*B;
		if( A>B ){
			System.out.println(A-B);
		}else{
			System.out.println(0);
		}
	}
}
