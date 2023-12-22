import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		long sum=0,left=0;
		int[] A = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if(temp>=A[i]){
				temp -= A[i];
				if(A[i+1]>temp) A[i+1] -= temp;
				else A[i+1] = 0;
				A[i]=0;
			}else A[i] -= temp;
		}
		for(int i=0;i<=N;i++) left += A[i];
		System.out.println(sum-left);
	}
}