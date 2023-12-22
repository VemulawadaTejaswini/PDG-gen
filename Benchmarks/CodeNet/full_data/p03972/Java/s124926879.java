import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int H = scan.nextInt();
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for(int i=0;i<W;i++){
			pq.add(new Pair(scan.nextLong(),i));
		}
		for(int i=0;i<H;i++){
			pq.add(new Pair(scan.nextLong(),i+W));
		}

		long res = 0;
		int w = W+1;
		int h = H+1;

		while(!pq.isEmpty()){
			Pair p = pq.poll();
			long val = p.p;
			long index = p.q;

			if(index < W && h > 0){
				res += h*val;
				w--;
			}else if( index >= W && w > 0 ){
				res += w*val;
				h--;
			}

		}
		System.out.println(res);

	}

	static class Pair implements Comparable{
		long p, q;
		public Pair(long p, long q){
			this.p = p;
			this.q = q;

		}
		public int compareTo(Object object){
			Pair other = (Pair)object;
			return (int)(this.p-((Pair)other).p);
		}
	}

}