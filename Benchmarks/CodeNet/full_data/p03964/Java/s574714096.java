import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			long[][] A = new long[N][2];

			for(int i = 0 ; i < N ; i++){
				A[i][0] = sc.nextLong();
				A[i][1] = sc.nextLong();
			}
			sc.close();
			long ans = 0;
			ans = A[0][0] + A[0][1];

			for(int i = 1 ; i < N ; i++){

				if(A[i][0]-A[i-1][0]>=0 && A[i][1]-A[i-1][1]>=0){
					ans+= (A[i][0]-A[i-1][0])+ (A[i][1]-A[i-1][1]);
				}
				else{
					long p = Math.max((long)Math.ceil((double)(A[i-1][0]/A[i][0])), (long)Math.ceil((double)(A[i-1][1]/A[i][1])));

					ans +=(A[i][0]*p - A[i-1][0]) + (A[i][1]*p-A[i-1][1]);
					A[i][0] = A[i][0]*p;
					A[i][1] = A[i][1]*p;

				}
			}

			System.out.println(ans);
	}
}
