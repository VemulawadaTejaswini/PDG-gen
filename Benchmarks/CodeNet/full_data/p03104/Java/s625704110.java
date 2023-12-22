import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			long A = Long.parseLong(sc.next());
			long B = Long.parseLong(sc.next());
			long ret = A;
			for(long i = A + 1; i <= B; i++ ) {
				ret = (ret ^ i);
			}
			
			System.out.println(ret);
		} // Scanner Close
	}
}