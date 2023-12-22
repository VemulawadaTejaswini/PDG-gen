import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X[] = new int[M];
		for(int i=0;i<M;i++) {
			X[i]=sc.nextInt();
		}
		Arrays.sort(X);
		if(N>=M) {
			System.out.println(0);
			return;
		}
		
		if(N==1) {
			System.out.println(X[M-1]-X[0]);
			return;
		}
		
		//M個の座標をN個の塊に分ける。
		//大きい間隔は避けたいので、M個の座標のうち最大間隔を求める。
		
		PriorityQueue pq = new PriorityQueue(1, new MeanComparator());
		for(int i=0;i<M-1;i++) {
			Mean mean = new Mean();
			mean.setFrom_point(X[i]);//元の位置
			mean.setTo_point(X[i+1]);
			mean.setLength(X[i+1]-X[i]);
			pq.add(mean);
		}
		int ans = 0;
		int fromP[] = new int[N-1];
		int toP[] = new int[N-1];
		for(int i=0;i<N-1;i++) {
			Mean tmp = (Mean)pq.poll();
			fromP[i] = tmp.getFrom_point();
			toP[i] = tmp.getTo_point();
		}
		
		Arrays.sort(fromP);
		Arrays.sort(toP);
		
		ans = fromP[0]-X[0];
		for(int i=1;i<N-1;i++) {
			ans += (fromP[i]-toP[i-1]);
		}
		ans += (X[M-1]-toP[N-2]);
		
		
		System.out.println(ans);
			
		}
		
		
 	}

	class Mean{
		private int from_point;
		private int to_point;
		private int length;
		public int getTo_point() {
			return to_point;
		}
		public void setTo_point(int to_point) {
			this.to_point = to_point;
		}
		public int getFrom_point() {
			return from_point;
		}
		public void setFrom_point(int from_point) {
			this.from_point = from_point;
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		
	}

	
	class MeanComparator implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			Mean m1 = (Mean)o1;
			Mean m2 = (Mean)o2;
 			int c1 = m1.getLength();
 			int c2 = m2.getLength();
 					
 			if(c1>c2) {
 				return -1;
 			}else if(c1<c2) {
 				return 1;
 			}else {
 				return 0;
 			}
		}
		
	}

