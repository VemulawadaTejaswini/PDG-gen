import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long P = sc.nextLong();
		long baseP = P;
		
		if (N == 1) {
			System.out.println(P);
			return;
		}
		
		long ans = 1;
		for (long i = 2; i * i <= baseP; i++) {
			int count = 0;
			while(P % i == 0) {
				count++;
				P /= i;
			}
			
			if (count >= N) {
				ans = ans * i * (count / N);
			}
		}
		
		System.out.println(ans);
	}
}
