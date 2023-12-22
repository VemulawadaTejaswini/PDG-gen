import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		}

		
		for (int i=0; i<N-1; i++) {
			while (true) {
				if (A[i] < A[i+1]) {
					if (A[i+1] % A[i] == 0) {
						A[i+1] = A[i];
						break;
					}
					
					A[i+1] = A[i+1] % A[i];
				}
				else if (A[i] > A[i+1]) {
					if (A[i] % A[i+1] == 0) {
						A[i] = A[i+1];
						break;
					}
					
					A[i] = A[i] % A[i+1];
				}
				else {
					break;
				}
			}
			
		}
		
		System.out.println(A[N-1]);
	}

}
