import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		boolean ok = true;
		if(N % 2 == 1) {
			for(int i = 0; i < N; i++) {
				int A = sc.nextInt();
				if(A % 2 == 1) {
					ok = false;
					break;
				}
				X[A]++;
				if(X[A] > 2 || X[0] > 1) {
					ok = false;
					break;
				}
			}		
		}
		else {
			for(int i = 0; i < N; i++) {
				int A = sc.nextInt();
				if(A % 2 == 0) {
					ok = false;
					break;
				}
				X[i]++;
				if(X[i] > 2) {
					ok = false;
					break;
				}
			}		
		}
		long ans = 1;
		for(int i = 0; i < N/2; i++)
			ans = ans * 2 % 1000000009;
		System.out.println(ok ? ans : 0);
	}

}