import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];

		for(int i=0;i<N;i++) {
			array[i]=sc.nextInt();
		}
		Arrays.parallelSort(array);
		System.out.println(array[N-1]-array[0]);
	}
	public static int sample() {
		return 1;
	}

}
