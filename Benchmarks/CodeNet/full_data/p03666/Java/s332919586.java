import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long C = sc.nextLong();
		long D = sc.nextLong();
		
		boolean ok = false;
		for(int i=0; i<N; i++) {
			long max = (N-1-i)*D-i*C;
			long min = (N-1-i)*C-i*D;
			if(min <= B-A && B-A <=max) {
				ok = true;
				break;
			}
		}
		
		System.out.println(ok ? "YES" : "NO");
		
		sc.close();
	}
}
