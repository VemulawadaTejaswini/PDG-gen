import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N][3];
		boolean ok = true;
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
			A[i][2] = A[i][1] - A[i][0];
		}
		Arrays.sort(A, (x,y) -> x[1]-y[1]);
		int time = 0;
		for(int i = 0; i < N; i++) {
			if(time > A[i][2]) {
				ok = false;
				System.out.println(A[i][0]);
				break;
			}
			time += A[i][0];
		}
		System.out.println(ok ? "Yes" : "No");
	}

}
