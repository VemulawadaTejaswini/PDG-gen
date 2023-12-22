import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long N = scan.nextLong();
			long M = scan.nextLong();
			
			if(N==1) {
				if(M==1)System.out.println(1);
				if(M==2)System.out.println(0);
				if(M>=3)System.out.println(M-2);
			}else if(N==2) {
				System.out.println(0);
			}else if(N>=3) {
				if(M==1)System.out.println(N-2);
				if(M==2)System.out.println(0);
				if(M>=3)System.out.println((M-2)*(N-2));
			}
			
		}
		
		
	}
		

}
