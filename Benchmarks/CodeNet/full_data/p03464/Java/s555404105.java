import java.util.*;

public class Main{
	static int MAXn[];
	static int MINn[];
	static int A[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		MAXn = new int[K+1];
		MINn = new int[K+1];
		A = new int[K+1];
		
		for(int i = 1; i <= K;i++){
			A[i] = sc.nextInt();
		}
		
		MAXn[K] = 2;
		MINn[K] = 2;
		for(int i = K;i >= 1;i--){
				int a = (MINn[i]%A[i] != 0) ? 1 : 0;
				int q = MINn[i]/A[i];
				if((MINn[i]/A[i])*A[i] < MINn[i] && (MINn[i]/A[i]+1)*A[i] > MAXn[i]){
					System.out.println("-1");
					return;
				}else if((MAXn[i]/A[i])*A[i] > MAXn[i] && (MAXn[i]/A[i]-1)*A[i] > MINn[i]){
					System.out.println("-1");
					return;
				}
				q = q + a;
			MAXn[i-1] = (MAXn[i]/A[i])*A[i] + A[i] -1;
			MINn[i-1] = A[i]*q;


		}
		System.out.println(MINn[0] + " " + MAXn[0]);
	}
}

