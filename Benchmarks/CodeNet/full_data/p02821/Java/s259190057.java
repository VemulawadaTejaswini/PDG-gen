import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static int can(int X , int A[] ){
		int N = A.length;
		int S = 0;
		for(int i = 0 ; i < N ; ++i){
			int Y = X - A[i];
			int idx = Arrays.binarySearch(A, Y);
			if(idx < 0){
				idx = - idx - 1;
			}
			S += N - idx;
		}
		return S;
	}
	static long solve(int X , int A[]){
		int N = A.length;
		long S[] = new long[N + 1];
		for(int i = 0 ; i < N ; ++i){
			S[i + 1] = S[i] + A[i];
		}
		long ret = 0;
		for(int i = 0 ; i < N ; ++i){
			int Y = X - A[i];
			if(Y < 0){
				ret += S[N] + N * A[i];
				continue;
			}
			int idx = Arrays.binarySearch(A, Y);
			if(idx >= 0){
				ret += S[N] - S[idx] + (N - idx) * A[i];
			}else{
				idx = - idx - 1;
				ret += S[N] - S[idx] + (N - idx) * A[i];
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int low = 0;
		int high = A[N - 1] * 2;
		while(low < high){
			int mid = (low + high) / 2;
			int c = can(mid , A);
			if(c <= M){
				high = mid;
			}else{
				low = mid + 1;
			}
//			System.out.println(low+" "+mid+" "+high);
		}
		int c = can(high, A);
		if(c == M){
			System.out.println(solve(high, A));			
		}else{
			long S = solve(high, A);
//			int c2 = can(high - 1 , A);
			S += (high - 1) * (M - c);
			System.out.println(S);
		}
	}
}
