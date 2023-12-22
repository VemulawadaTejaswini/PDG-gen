import java.util.Scanner;

public class Main {

	private static final int k = 2019;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextInt();
      	long R = sc.nextInt();
      	
      	if (L == 0) {
      		System.out.println(0);
      		return ;
      	}
      	
      	long res = Integer.MAX_VALUE;
      	L = L % k;
      	R = R % k;
      	
        for (long i = L; i <= (R-1); i++) {
      		for (long j = i+1; j <= R; j++) {
      			long candidate = (i%k)*(j%k)%k;
      			res = Math.min(res, candidate);
      		}
        }
      	
      	
      	System.out.println(res);
		sc.close();
	}
}