import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		int A[] = new int[N];
		int B[] = new int[N];

		for(int i = 0; i < N; i++){
			A[i] = Integer.parseInt(sc.next());
			B[i] = Integer.parseInt(sc.next());
		}

		int res = 0;

		for(int i = N-1; i >= 0; i--){
			while(A[i] % B[i] != 0){
				for(int j = i; j >= 0; j--){
					A[j]++;
				}
				res++;
			}
		}

		System.out.println(res);

	}

}