import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		double sum = 0;
		int x = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		for(int i = 0; i < N; i++) {
			if(A[i] >= sum/4/M)
				x++;
		}
		System.out.println(x >= M ? "Yes" : "No");
	}

}
