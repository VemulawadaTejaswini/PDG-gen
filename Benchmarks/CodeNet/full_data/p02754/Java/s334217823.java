import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long cc = 0;
		if( N%(A+B)<=A ){
			cc = N%(A+B);
		}else{
			cc = A;
		}
		System.out.println(N/(A+B)*A+cc);
	}
}
