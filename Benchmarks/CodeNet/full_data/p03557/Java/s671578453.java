import java.util.*;

public class Main {
	static int N;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		int C[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int temp_a = lowerbound(A, B[i]);
			//System.out.println("a:" + temp_a);
			int temp_c = upperbound(C, B[i]);
			//System.out.println("c:" + temp_c);
			ans = ans + temp_a * (N - temp_c);
		}
		System.out.println(ans);
	}
	
	public static final int lowerbound(int[] arr, int value) {
	    int low = 0;
	    int high = arr.length;
	    int mid;
	    while (low < high) {
	        mid = ((high - low) >>> 1) + low;
	        if (arr[mid] < value) {
	            low = mid + 1;
	        } else {
	            high = mid;
	        }
	    }
	    return low;
	}
	
	public static final int upperbound(int[] arr, int value) {
	    int low = 0;
	    int high = arr.length;
	    int mid;
	    while (low < high) {
	        mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
	        if (arr[mid] <= value) {
	            low = mid + 1;
	        } else {
	            high = mid;
	        }
	    }
	    return low;
	}
}
