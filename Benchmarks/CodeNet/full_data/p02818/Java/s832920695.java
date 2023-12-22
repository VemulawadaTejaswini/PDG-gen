import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long k = stdIn.nextLong();
		
		for(long i = k; i > 0; i--) {
			if(a>=1) {
				a--;
			}else {
				b--;
			}
		}
		System.out.println(a+" "+b);
		
		
		
		
		
		
		
		
	}

}
