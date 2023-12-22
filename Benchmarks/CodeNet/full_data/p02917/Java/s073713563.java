import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int[] B = new int[N + 1];
		B[0] = Integer.MAX_VALUE;
		B[N] = Integer.MAX_VALUE;
		for(int i = 1; i < N; i++) {
			B[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			sum += Math.min(B[i], B[i + 1]);
		}
		System.out.println(sum);
	}
}