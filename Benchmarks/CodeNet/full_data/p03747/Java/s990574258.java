import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long L = sc.nextLong();
		long T = sc.nextLong();
		long[] x = new long[N];
		int[] dire = new int[N];
		for(int i = 0; i < N; i++){
			x[i] = sc.nextLong();
			dire[i] = sc.nextInt();
		}
		
		for(long i = 0; i < T; i++){
			Map<Long, Integer> map = new HashMap<Long, Integer>();
			//walk
			for(int j = 0; j < N; j++){
				if(map.containsKey(x[j])){
					int another = map.get(x[j]);
					x[another] += dire[another] == 1 ? -1 : 1;
					dire[another] = dire[another] == 1 ? 2 : 1;
					dire[j] = dire[j] == 1 ? 2 : 1;
					map.put(x[another], another);
				}
				else{
					if(dire[j] == 1){
						x[j] = (x[j] + 1) % L;
					}
					else if(dire[j] == 2){
						x[j] = x[j] - 1;
						if(x[j] < 0)
							x[j] += L;
					}
					if(!map.containsKey(x[j])){
						map.put(x[j], j);
					}
					else{
						int another = map.get(x[j]);
						dire[j] = dire[j] == 1 ? 2 : 1;
						dire[another] = dire[another] == 1 ? 2 : 1;
					}
				}
			}
		}
		
		for(int i = 0; i < N; i++){
			System.out.println(x[i]);
		}
		sc.close();
	}
}
