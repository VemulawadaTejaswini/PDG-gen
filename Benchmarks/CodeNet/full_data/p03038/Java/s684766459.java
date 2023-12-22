import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// TODO 自動生成されたメソッド・スタブ
		int N = 0;
		int M = 0;
		int B = 0;
		int C = 0;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		M = Integer.parseInt(sc.next());
		int[] A = new int[N];
		int i;
		for (i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		java.util.Arrays.sort(A);
		int j = 0;
		int preB = 0;
		long sum = 0;

		ArrayList<Integer> X = new ArrayList<Integer>();
		for (i = 0; i < M; i++) {
			B = Integer.parseInt(sc.next());
			preB = preB + B;
			for (; j < preB; j++) {
				X.add(B);
			}
		}
		int n = 0;
		Collections.sort(X);
		for (i = 0; i < X.size();) {
			if (n == N)
				break;
			if (A[n] < X.get(i)) {
				A[n] = X.get(i);
				n++;
				i++;
			} else {
				n++;
			}
		}
		for(i=0;i<N;i++){
			sum=sum+A[i];
		}
		System.out.println(sum);
	}
}