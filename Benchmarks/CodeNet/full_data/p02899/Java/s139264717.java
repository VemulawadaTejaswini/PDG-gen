import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] A = new int[N][2];
		for(int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = i+1;
		}
		Arrays.sort(A, (x,y) -> x[0]-y[0]);
		for(int i = 0; i < N; i++)
			System.out.print(A[i][1]+" ");
		System.out.println();

	}

}