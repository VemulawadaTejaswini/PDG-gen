import java.util.*;
public class Main { //atcoder ABC128C -

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt();
		int m = seer.nextInt();
		ArrayList<Integer>[] bs = new ArrayList[m];
		for(int i = 0; i < m; i++){
			int k = seer.nextInt();
			bs[i] = new ArrayList<>();
			for(int j = 0; j < k; j++){
				bs[i].add(seer.nextInt()-1);
			}
		}
		int[] ps = new int[m];
		for(int i = 0; i < m; i++){
			ps[i] = seer.nextInt();
		}
		int res = 0;
		for(int mask = 0; mask < (1 << n); mask++){
			boolean add = true;
			for(int i = 0; i < m; i++){
				int comp = 0;
				for(int k: bs[i]){
					if((mask & (1 << k)) > 0){
						comp++;
					}
				}
				if(comp % 2 != ps[i]){
					add = false;
				}
			}
			if(add) res++;
		}
		System.out.println(res);
	}
}
