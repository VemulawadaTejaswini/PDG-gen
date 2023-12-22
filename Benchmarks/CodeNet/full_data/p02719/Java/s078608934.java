import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long n = stdIn.nextLong();
		long k = stdIn.nextLong();

		long min = Long.MAX_VALUE;

		long y = n;
		if(k==1) {
			System.out.println(0);
			return;
		}
		
		while(true) {
			min = Math.abs(y-k);
			if(min < Math.abs(min-k)) {
				System.out.println(min);
				break;
			}else {
				y = Math.abs(y-k);
			}





		}





	}

}
