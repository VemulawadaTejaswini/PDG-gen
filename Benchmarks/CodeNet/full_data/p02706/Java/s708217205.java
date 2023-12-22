import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[100001];
		int Asum = 0;
		
		for(int i =0; i<M; i++) {
			A[i] = sc.nextInt();
			System.out.println(A[i]);
			Asum = Asum+A[i];
		}
		
		if(N-Asum>=0) {
			System.out.println(N-Asum);
		}else {
			System.out.println(-1);
		}
		sc.close();
	}
}