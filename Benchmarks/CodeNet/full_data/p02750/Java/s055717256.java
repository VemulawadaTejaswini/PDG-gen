
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		long T = in.nextLong();
		ArrayList<long[]> list = new ArrayList<long[]>();
//		ArrayList<Integer> total = new ArrayList<Integer>();
		long time = 1;
		long count = 0;
		for(int i=0; i<N; i++) {
			long[] temp = new long[3];
			temp[0] = in.nextLong();
			temp[1] = in.nextLong();
			temp[2] = temp[0]*time+temp[1];
			list.add(temp);
		}
		while(time<T+0.5) {
			Collections.sort(list, comparator);
			time += list.get(0)[2];
			if(time>T+0.5) break;
			count++;
			list.remove(0);
			if(list.size()==0) break;
			for(int i=0; i<N; i++) {
				long[] temp = list.get(0);
				temp[2] = temp[0]*time+temp[1];
			}
		}
		System.out.print(count);
	}
	static Comparator<long[]> comparator = new Comparator<long[]>() {
		@Override
		public int compare(long[] a, long[] b) {
			if( a[2] <= b[2]) return -1;
			else return 1;
		}
	};
	
}
