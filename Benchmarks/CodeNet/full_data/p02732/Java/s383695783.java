import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if(map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], 1);
			}
		}
		
		long ans = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			ans += entry.getValue() * (entry.getValue() - 1) / 2;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(ans - (map.get(A[i]) - 1));
		}
	}
}
