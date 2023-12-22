import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		int[] copyA = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			copyA[i] = A[i];
		}
		Arrays.sort(copyA);
		int idx = 0;
		for(idx = 0; idx < N; idx++){
			if(A[idx] == copyA[N-1]) break;
		}
		int max = A[idx] + B[idx];
		System.out.println(max);
    }
}