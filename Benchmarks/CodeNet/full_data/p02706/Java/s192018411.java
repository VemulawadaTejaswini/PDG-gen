import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		int N = cin.nextInt();
		int M = cin.nextInt();
		
		int A[] = new int[1100];
		
		
		for(int i = 0;i<M;i++) A[i] = cin.nextInt();
		
		int sum = 0;
		for(int i = 0;i<M;i++) {
			sum += A[i];
			if(sum>N) {
				System.out.println(-1);
				return;
			}
		}

		System.out.println(N-sum);
	}

}
