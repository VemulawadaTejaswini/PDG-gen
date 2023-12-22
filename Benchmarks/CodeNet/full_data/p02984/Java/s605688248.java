import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A= new int[N];

		for(int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}

		// 降った雨の量 x[i]
		// xi + xi+1 = Ai
		int[] x = new int[N];
		// x1 = S - (x2 + x3 + ... xn)
		//    = x1 - x2 + x3 - x4 + .... - xn-1 + xn
		x[0]=0;
		for(int i=0;i<N;i++){
			x[0] += i%2==0 ? A[i] : -1*A[i];
		}
		// xi = 2Ai - xi
		for(int i=0; i<N-1; i++){
			x[i+1] = 2*A[i] - x[i];
		}

		for(int i=0;i<N;i++){
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
}
