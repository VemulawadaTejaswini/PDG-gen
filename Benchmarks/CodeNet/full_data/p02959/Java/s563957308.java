import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(),sum=0;
		int[] A = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if(temp>=A[i]){
				if(A[i+1]+A[i]>temp) {
					A[i+1] -= temp -A[i];
				}
				else {
                  	sum += A[i+1]+A[i];
					A[i+1] = 0;
                  continue;
				}
			}
			sum +=temp;
		}
		System.out.println(sum);
	}
}