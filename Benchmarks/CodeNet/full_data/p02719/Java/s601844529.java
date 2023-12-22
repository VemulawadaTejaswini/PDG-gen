import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N= sc.nextLong();
		long M = sc.nextLong();
		long t = N % M;
		long mae = t;
		while(true) {
		    if(mae < Math.abs(mae-M)) {
				break;
			 }else {
				mae = Math.abs(mae-M);
		     }
		}	
		
		System.out.println(mae);
		
	}
	

}
