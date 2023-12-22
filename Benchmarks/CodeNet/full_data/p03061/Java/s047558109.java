
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] as = new int[N];
		Map<Integer, Integer> res = new HashMap<Integer, Integer>();
		int result = 1;
		for (int i = 0; i < N; i++) {
			if (sc.hasNext()) {
				as[i] = sc.nextInt();
				int suba = (int) Math.sqrt(as[i]);
				for(int j=1; j <= suba;j++) {
					if(as[i] % j == 0) {
						res.put(j, res.getOrDefault(j, 0)+1);
						res.put(as[i]/j, res.getOrDefault(as[i]/j, 0)+1);
						if (res.getOrDefault(j, 0) == N || res.getOrDefault(j, 0) == N-1) {
							if (j > result) {
								result = j;
							}
						}
						if (res.getOrDefault(as[i]/j, 0) == N || res.getOrDefault(as[i]/j, 0) == N-1) {
							if (as[i]/j > result) {
								result = as[i]/j;
							}
						}
					}
				}
			}
		}	
		System.out.println(result);
	}
}