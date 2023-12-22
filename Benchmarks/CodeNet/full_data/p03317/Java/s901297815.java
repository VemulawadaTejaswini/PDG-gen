import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		partC101();
	}


	public static void partC101() {
		Scanner scC = new Scanner(System.in);
		int N = scC.nextInt();
		int K = scC.nextInt();
		int[] A = new int[N];

		for(int i = 0 ; i < N ; i++) {
			A[i] = scC.nextInt();
		}

		if(K == N) {
			System.out.println(1);
		}else if(K == 2) {
			System.out.println(N - 1);
		}else if(K > (N / 2)) {
			System.out.println(2);
		}else {
			if((N-1) % (K-1) == 0){
				System.out.println((N-1) / (K-1));
			}else {
				System.out.println(((N-1) / (K-1)) + 1);
			}
		}
	}
}