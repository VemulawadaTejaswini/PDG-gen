import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			if(A[i] >= H && B[i] >= W) cnt++;
		}
		
		System.out.println(cnt);
	}
}
