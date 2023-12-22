import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A= new int[N];

		for(int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}

		int[] x = new int[N];
		x[0]=0;
		for(int i=0;i<N;i++){
			x[0] += i%2==0 ? A[i] : -1*A[i];
		}
		for(int i=0; i<N-1; i++){
			x[i+1] = 2*A[i] - x[i];
		}

		for(int i=0;i<N;i++){
			System.out.print(x[i] + " ");
		}
		System.out.println();



	}
}
