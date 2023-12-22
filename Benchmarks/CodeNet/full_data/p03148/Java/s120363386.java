import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long t[][] = new long[N][2];
		ArrayList<ArrayList<Long>> ary = new ArrayList<ArrayList<Long>>();
		for(int i = 0; i < 10000; i++) {
			ary.add(new ArrayList<Long>());
			ary.get(i).add(Long.MAX_VALUE);
		}
		long max = 0;
		int type = 0;
		boolean flag[] = new boolean[10000];
		for(int i = 0; i < N; i++) {
			t[i][0] = sc.nextLong();
			t[i][1] = sc.nextLong();
			if(flag[(int)t[i][0]]) {
				ary.get((int)t[i][0]).add(t[i][1]);
			} else {
				type++;
				ary.get((int)t[i][0]).add(t[i][1]);
				flag[(int)t[i][0]] = true;
			}
			max += t[i][1];
		}
		max += type * type;
		
		for(int i = 0; i < N; i++) {
			Collections.sort(ary.get(i));
		}
		
		for(int i = 0; i < N - K; i++) {
			long min = Long.MAX_VALUE;
			long min2 = Long.MAX_VALUE;
			int min_n = 0;
			int min2_n = 0;
			for(int j = 0; j < N; j++) {
				if(ary.get(j).get(0) < min && ary.get(j).size() == 2) {
					min = ary.get(j).get(0);
					min_n = j;
				}
				if(ary.get(j).get(0) < min2 && ary.get(j).size() != 2) {
					min2 = ary.get(j).get(0);
					min2_n = j;
				}
			}
			
			if(min2 <= min) {
				max -= min2;
				ary.get(min2_n).remove(0);
			} else {
				if(max - min - (type * type - (type - 1) * (type - 1)) > max - min2) {
					max = max - min - (type * type - (type - 1) * (type - 1));
					ary.get(min_n).remove(0);
				} else {
					max -= min2;
					ary.get(min2_n).remove(0);
				}
			}
		}
		System.out.println(max);
	}
}
