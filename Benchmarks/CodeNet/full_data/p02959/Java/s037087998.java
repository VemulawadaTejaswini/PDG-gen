import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N+1];
		int[] B = new int[N];
		for (int i = 0; i < N+1; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		int count = 0;
		for(int i = 0;i<N;i++) {
			if(B[i]<=(A[i]+A[i+1])) {
				count+=B[i];
			}else {
				count+=(A[i]+A[i+1]);
			}
		}
		System.out.println(count);

	}

}
