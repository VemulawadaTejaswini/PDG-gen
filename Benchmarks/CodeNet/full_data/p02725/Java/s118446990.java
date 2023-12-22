import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int N = sc.nextInt();
		int[] A = new int[N];

		for(int i = 0; i < N; i++)
		{
			A[i] = sc.nextInt();
		}

		int min = A[0], max = A[N-1];
		if(A[0] == 0)
			min = A[1];

		int dis = max-min;

		System.out.println(dis);
	}
}
