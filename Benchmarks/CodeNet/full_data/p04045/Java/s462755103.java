import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String[] D = new String[K];
		
		for(int i = 0; i < K; i++) {
			D[i] = sc.next();
		}
		
		for(int i = N; i < 100000; i++) {
			String x = String.valueOf(i);
			for(int j = 0; j < K; j++) {
				if(x.indexOf(D[j]) >= 0) {
					break;
				}
				if(j == K - 1 && x.indexOf(D[j]) == -1) {
					System.out.println(x);
					return;
				}
			}
		}
		
		
	}
}
