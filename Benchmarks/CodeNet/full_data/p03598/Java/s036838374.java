import java.util.Scanner;

public class CollectingBalls {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int[] x = new int[N];
	int[] tmp = new int[N];
	int sum = 0;

	for(int i=0; i<N; i++) {
		x[i] = sc.nextInt();
		tmp[i] = K - x[i];
		if(x[i] < tmp[i]) {
			tmp[i] = x[i];
		}
		sum += tmp[i];
	}

	System.out.println(2*sum);
	}
}