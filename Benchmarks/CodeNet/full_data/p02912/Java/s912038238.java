import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
//		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();

		long sum = getAnswer(N,M) ;
		System.out.println(sum);
	}

	public long getAnswer(int N, int M) {
		long A[] = new long[N];

		for(int i = 0 ; i < N; i ++) {
			A[i] = sc.nextLong();
		}

		Arrays.sort(A);

		int ticket = M ;
		int MAX_TICKET = (int)(Math.log((double)A[N-1])/Math.log(2));
		if(ticket < MAX_TICKET) {
			MAX_TICKET = ticket ;
		}

		long sum = 0 ;

		for(int i = 0 ; i < M ; i ++) {
			A[N-1] = A[N-1]/2 ;
			this.sort(A);
		}

		for(int i = 0 ; i <N ; i ++) {
			sum += A[i];
		}

		return sum ;
	}

	void sort(long[] array) {
		for (int i = array.length - 1; 0 < i; i--) {
			if (array[i - 1] > array[i]) {
				// 入れ替え
				long tmp = array[i - 1];
				array[i - 1] = array[i];
				array[i] = tmp;
			}else {
				break ;
			}
		}
	}
}
