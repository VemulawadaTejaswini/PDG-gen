import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long[] A = new long[N], B = new long[N];
		PriorityQueue<Pair> PQ = new PriorityQueue<Pair>();
		for(int i = 0;i < N;i++) {
			A[i] = scn.nextLong();
		}
		for(int i = 0;i < N;i++) {
			B[i] = scn.nextLong();
			if(B[i] != A[i]) {
				PQ.add(new Pair(i,B[i]));
			}
		}
		boolean can = true;
		long ans = 0;
		while(!PQ.isEmpty()) {
			Pair p = PQ.poll();
			int num = p.num;
			int numb = (num-1+N)%N;
			int numf = (num+1)%N;

			if(B[num] - A[num] < B[numb] + B[numf]) {
				can = false;
				break;
			}

			long t = (B[num] - A[num])/(B[numb] + B[numf]);

			B[num] -= (B[numb] + B[numf])*t;
			ans+=t;
			if(B[num] != A[num]) {
				PQ.add(new Pair(num,B[num]));
			}

		}
		System.out.println((can)?ans:-1);


	}

}

class Pair implements Comparable<Pair>{
	long val;
	int num;
	public Pair(int num, long val) {
		this.num = num;
		this.val = val;
	}
	@Override
	public int compareTo(Pair o) {
		if(this.val < o.val)return 1;
		if(this.val > o.val)return -1;
		return 0;
	}
}

