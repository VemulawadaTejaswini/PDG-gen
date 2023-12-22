import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = (long) (Math.pow(10, 9) + 7);
		int[] C = new int[N];
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>(); 
		int past = -1;
		int numdup = 0;
		for(int i=0;i<N;i++) {
			int c = sc.nextInt();
			if (c == past) {
				numdup++;
				continue;
			}
			C[i] = c;
			past = C[i];
			if(map.containsKey(C[i])) {
				map.get(C[i]).add(i);
			}
			else {
				ArrayList<Integer> lis = new ArrayList<Integer>();
				lis.add(i);
				map.put(C[i],lis);
			}
		}
		N -= numdup;
		System.out.println(retn(0,N,M,C,map));
		
	}
	//i以降における部分問題回答
	public static long retn(int i, int N,long M, int[]C, HashMap<Integer, ArrayList<Integer>> map) {
		if (i >= N-1) return 1;
		else {
			long ret = 0;
			for(int x : map.get(C[i])) {
				if (x >= i) {
					ret = (ret + retn(x+1,N,M,C,map)) % M;
				}
			}
			return ret % M;
		}
	}

}
