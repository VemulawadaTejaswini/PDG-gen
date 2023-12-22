import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int[] T = new int[N];
		for(int i = 0; i < T.length; i++) {
			T[i] = sc.nextInt();	
		}
		int M = sc.nextInt();
		int[] P = new int [M];
		int[] X = new int [M];
		for(int i = 0; i < M; i++) {
			P[i] = sc.nextInt();
			X[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < M; i++) {
			int a = P[i];
			int b = T[a - 1];
			T[a - 1] = X[i];
			for(int j = 0; j < N; j++) {
				sum += T[j];
			}
			System.out.println(sum);
			sum = 0;
			T[a - 1] = b;
			
		}

	}

}