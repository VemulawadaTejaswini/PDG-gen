import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			int[]D = new int[N];
			Map<Integer,Integer>dm = new TreeMap<Integer,Integer>();
			for(int i = 0;i<N;i++) {
				D[i] = scan.nextInt();
				if(dm.containsKey(D[i]))dm.put(D[i], dm.get(D[i])+1);
				else dm.put(D[i], 1);
			}

			int M = scan.nextInt();
			int[]T = new int[M];
			Map<Integer,Integer>tm = new TreeMap<Integer,Integer>();
			for(int i = 0;i<M;i++) {
				T[i] = scan.nextInt();
				if(tm.containsKey(T[i]))tm.put(T[i], tm.get(T[i])+1);
				else tm.put(T[i], 1);
			}

			if(N<M) {
				System.out.println("No");
				return;
			}

			int ok = 1;

			for(Integer key:tm.keySet()) {
				int val = tm.get(key);

				if(!dm.containsKey(key)) {
					ok=0;
					break;
				}else{
					int dv = dm.get(key);
					if(val>dv) {
						ok=0;
						break;
					}
				}

			}

			if(ok==1)System.out.println("Yes");
			else System.out.println("No");





		}


	}


}
