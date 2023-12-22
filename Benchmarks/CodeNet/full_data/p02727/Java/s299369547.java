import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static long[] accum(long A[]){
		long ret[] = new long[A.length + 1];
		ret[0] = 0;
		for(int i = 0 ; i < A.length ; ++i){
			ret[i + 1] = ret[i] + A[i];
		}
		return ret;
	}
	static long[] rev(long A[]){
		long[] ret = new long[A.length];
		for(int i = 0 ; i < ret.length ; ++i){
			ret[i] = A[A.length - 1 - i];
		}
		return ret;
	}
	static long solve(int X , int Y , long P[] , long Q[] , long R[]){
		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		for(int i = 0 ; i < X ; ++i){
			pq.add(P[i]);
		}
		for(int i = 0 ; i < Y ; ++i){
			pq.add(Q[i]);
		}
		for(int i = 0 ; i < R.length ; ++i){
			long c = pq.peek();
			long ri = R[i];
			if(c > ri){
				break;
			}else{
				pq.poll();
				pq.add(ri);
			}
		}
		long S = 0;
		for(long v : pq){
			S += v;
		}
		return S;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		long P[] = new long[A];
		long Q[] = new long[B];
		long R[] = new long[C];
		for(int i = 0 ; i < A ; ++i){
			P[i] = sc.nextLong();
		}
		for(int i = 0 ; i < B ; ++i){
			Q[i] = sc.nextLong();
		}
		for(int i = 0 ; i < C ; ++i){
			R[i] = sc.nextLong();
		}
		Arrays.sort(P);
		Arrays.sort(Q);
		Arrays.sort(R);
		System.out.println(solve(X , Y , rev(P) , rev(Q) , rev(R)));
	}
}
