import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] trees = new int[N];

		for(int i=0;i<N;i++) {
			trees[i]=sc.nextInt();
		}

		Arrays.sort(trees);
//		System.out.println(Arrays.toString(trees));

		int min=Integer.MAX_VALUE;
		for(int i=0;i<N-K+1;i++) {
			min=Math.min(min,Math.abs(trees[i]-trees[i+K-1]));
		}
		System.out.println(min);
	}


}
