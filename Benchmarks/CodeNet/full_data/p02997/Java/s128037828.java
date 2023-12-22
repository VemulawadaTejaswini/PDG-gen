import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		if((N-1)*(N-2)/2<K) {
			System.out.println(-1);
		} else {
			int connect = (N-1)*(N-2)/2 - K;
			System.out.println(N-1+connect);
			for(int i=0; i<N-1; i++) {
				System.out.println("1 " + (i+2));
			}
			for(int i=2; i<=N; i++) {
				for(int j=i+1; j<=N; j++) {
					if(connect>0) {
						System.out.println(i + " " + j);
						connect--;
					}
				}
			}
		}
		sc.close();
	}
}
