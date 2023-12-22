import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] A = new int[N];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			if (map.containsKey(A[i])) map.put(A[i],1+map.get(A[i]));
			else map.put(A[i],1);
 		}
		Arrays.sort(A);
		int ret = 0;
		for(int i=N-1;i>=0;i--) {
			if(map.get(A[i])==0) continue;
			map.put(A[i],map.get(A[i]-1));
			//一番左のbitを１にしたのを２倍
			int k2 = 2*Integer.highestOneBit(A[i]);
			int diff = k2-A[i];
			if(map.containsKey(diff) && map.get(diff)>0) {
				map.put(diff,map.get(diff)-1);
				ret++;
			}
		}
		System.out.println(ret);
	}
}
