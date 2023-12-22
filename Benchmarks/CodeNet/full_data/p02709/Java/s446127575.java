import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
	static long best = 0;
	static long sum = 0;
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] A = new int[N];
		Integer[] idx = new Integer[N];
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			idx[i] = i + 1;
		}
		
		List<Integer> ls = Arrays.asList(idx);
		permute(ls, 0, A);
		System.out.println(best);

	}

	static void permute(List<Integer> arr, int k, int[] A) {
		for (int i = k; i < arr.size(); i++) {
			java.util.Collections.swap(arr, i, k);
			permute(arr, k + 1, A);
			java.util.Collections.swap(arr, k, i);
		}
		if (k == arr.size() - 1) {
			for (int i = 0; i < arr.size(); i++) {
				sum += A[i]*(Math.abs(i+1-arr.get(i)));
				if(sum>best) best=sum;
			}
			sum=0;
		}
	}
}
