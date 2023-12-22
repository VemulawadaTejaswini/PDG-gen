import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N-1];
		int n = 0;
		int c = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < 9; i++) {
				if(A[i] % 2 == 1) {
					break;
				}else {
					c++;
				}
				if(c == N) {
					n++;
				}else {
					
				}
				c = 0;
			}
		}
		System.out.println(n);
	}

}
