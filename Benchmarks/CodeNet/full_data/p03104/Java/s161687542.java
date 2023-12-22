import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		long ans = A;
		long diff = B-A;
		
		StringBuffer str ;
		for(long i=A+1; i<B+1; i++){
			ans = ans ^ i;
			//System.out.println(ans);
		}
		System.out.println(ans);
		sc.close();
	}
	

}