import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int L = stdIn.nextInt();
		int R = stdIn.nextInt();
		for(int i = L; i <= R; i++) {
			if(i%673 == 0 && ((R-L+1) >= 3 || i-1 >= L)) {
				System.out.println(0);
				System.exit(0);
			}
		}
		
		System.out.println((L*(L+1))%2019);

	}

}