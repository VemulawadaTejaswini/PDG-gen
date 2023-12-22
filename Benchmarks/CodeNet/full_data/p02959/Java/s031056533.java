import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(),sum=0;
		int[] A = new int[N + 1],B = new int[N];
		for (int i = 0; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) B[i]=sc.nextInt();
		for (int i = 0;i<N; i++) {
			if(B[i]>A[i]){
				sum += A[i];
				B[i] -= A[i];
				if(B[i]>A[i+1]) {
					sum += A[i+1];
					A[i+1]=0;
				}else {
					sum += B[i];
					A[i+1] -= B[i];
				}
			}else sum += B[i];
		}
		System.out.println(sum);
	}
}