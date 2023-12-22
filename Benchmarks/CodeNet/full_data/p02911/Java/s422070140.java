import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int[] A = new int[100001];
		int[] tokuten = new int[100001];
		int num = 0;
		
		for(int i = 0; i < Q; i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			tokuten[i] = K;
		}
		
		for(int j= 0; j < N; j++) {
			for(int i = 0; i < Q; i++) {
				num = A[i];
				if(j+1 != num) {
					tokuten[j]--;
				}				
			}
			if(tokuten[j] <= 0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
		sc.close();
	}
}
