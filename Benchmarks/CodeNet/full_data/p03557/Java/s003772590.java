import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
		};
		int[] B = new int[n];
		for(int i=0; i<n; i++){
			B[i] = sc.nextInt();
		};
		int[] C = new int[n];
		for(int i=0; i<n; i++){
			C[i] = sc.nextInt();
		};
		sc.close();
		int count = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				for(int k=0; k<n; k++){
					if(A[i] < B[j] && B[j] < C[k]) {
						count++;
					}
				};
			};
		};
		System.out.println(count);
	}
}