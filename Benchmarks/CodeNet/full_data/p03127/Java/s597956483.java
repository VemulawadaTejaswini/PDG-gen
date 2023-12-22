import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 2; i <= A[0]; i++) {
			while(A[0] % i == 0 && A[0] > 1) {
				if(map.containsKey(i)) {
					map.put(i, map.get(i) + 1);
				} else {
					map.put(i, 1);
				}
				A[0] /= i;
			}
		}
		
		for(int i = 1; i < N; i++) {
			for(int key : map.keySet()) {
				if(A[i] % key != 0) {
					map.remove(key);
					continue;
				}
				int cnt = 0;
				while(A[i] % key == 0) {
					cnt++;
					A[i] /= key;
				}
				if(cnt < map.get(key)) {
					map.put(key, cnt);
				}
			}
		}
		
		int ans = 1;
		for(int key : map.keySet()) {
			ans *= Math.pow(key, map.get(key));
		}
		System.out.println(ans);
	}
}
