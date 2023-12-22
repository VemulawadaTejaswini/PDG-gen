import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		int A[] = new int[N];
		int B[] = new int[N];
		int c[] = new int[N];

		for(int i = 0; i < N; i++){
			c[i] = 0;
		}

		for(int i = 0; i < N; i++){
			A[i] = Integer.parseInt(sc.next());
			B[i] = Integer.parseInt(sc.next());
		}

		while((A[N-1] + c[N-1]) % B[N-1] != 0){
			c[N-1]++;
		}

		for(int i = N-2; i >= 0; i--){
			c[i]= c[i+1];
			while((A[i] + c[i]) % B[i] != 0){
				c[i]++;
			}
		}

		System.out.println(c[0]);

	}

}