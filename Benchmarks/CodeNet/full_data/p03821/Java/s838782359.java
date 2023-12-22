import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		int A[] = new int[N];
		int B[] = new int[N];
		int start[] = new int[N];
		int end[] = new int[N];

		for(int i = 0; i < N; i++){
			start[i] = 0;
			end[i] = 0;
		}

		for(int i = 0; i < N; i++){
			A[i] = Integer.parseInt(sc.next());
			B[i] = Integer.parseInt(sc.next());
		}

		int res = 0;

		for(int i = N-1; i >= 0; i--){
			int count = A[i];
			for(int j = i+1; j < N; j++){
				count += start[j];
			}
			while(count % B[i] != 0){
				count++;
				start[i]++;
				res++;
			}
		}

		System.out.println(res);

	}

}