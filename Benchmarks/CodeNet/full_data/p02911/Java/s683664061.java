import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] A = new int[100001];
		
		for(int i = 0; i < Q; i++) {
			A[i] = sc.nextInt();
		}

		for(int j= 0; j < N; j++) {
			int num = K;
			for(int i = 0; i < Q; i++) {
				if(j+1 != A[i]) {
					num--;
				}				
			}
			if(num <= 0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
		sc.close();
	}
}
