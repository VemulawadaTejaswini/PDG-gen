import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long L = stdIn.nextInt();
		long R = stdIn.nextInt();
		for(long i = L; i <= R; i++) {
			if(i%673 == 0 && ((R-L+1) >= 3 || i-1 >= L)) {
				System.out.println(0);
				System.exit(0);
			}
		}
		
		long a = L*(L+1);
		System.out.println(a%2019);

	}

}