import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int M  = sc.nextInt();
		
		String[] A = new String[N];
		String[] B = new String[M];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.next();
		}
		
		for(int i = 0; i < M; i++) {
			B[i] = sc.next();
		}
		
		for(int i = 0; i <= N - M; i++) {
			for(int j = 0; j <= N - M; j++) {
				int check = 0;
				for(int k = 0; k < M; k++) {
					String a = A[k + i].substring(j, A[k + i].length());
					if(!a.equals(B[k])) {
						check++;
						break;
					}
				}
				if(check == 0) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}
