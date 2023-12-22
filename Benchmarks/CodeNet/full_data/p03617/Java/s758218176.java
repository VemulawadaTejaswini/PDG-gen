import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long Q, H, S, D, N;
		Q = sc.nextLong();
		H = min(sc.nextLong(), 2*Q);
		S = min(sc.nextLong(), 2*H);
		D = sc.nextLong();
		N = sc.nextLong();
		sc.close();
		long ans;
		if(D>=2*S) {
			ans = N*S;
		} else {
			if(N%2==1) {
				ans = D*(N/2) + S;
			} else {
				ans = D*(N/2);
			}
		}
		System.out.println(ans);
		
	}
	
	private static long min(long a, long b) {
		if(a>b) {
			return b;
		} else {
			return a;
		}
	}

}
