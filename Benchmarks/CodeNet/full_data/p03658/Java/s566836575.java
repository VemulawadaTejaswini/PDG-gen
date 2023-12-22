import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),K=sc.nextInt();
		int[] array = new int[N];
		int sum=0;
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
		}

		Arrays.parallelSort(array);
		for(int i=N-1;i>=N-K;i--) {
			sum += array[i];
		}
		System.out.println(sum);
	}
	public static int sample() {
		return 1;
	}

}
