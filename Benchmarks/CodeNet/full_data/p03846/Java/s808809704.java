import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		long ans = 1;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if(A[i] > N - 1) {
				System.out.println(0);
				return;
			}
			if(N % 2 == 1) {
				if(map.containsKey(A[i])){
					if(map.get(A[i]) == 1 && A[i] != 0) {
						map.put(A[i], 2);
						ans = ans * 2 % 1000000007;
					} else {
						System.out.println(0);
						return;
					}
				} else {
					map.put(A[i], 1);
				}
			} else {
				if(A[i] == 0) {
					System.out.println(0);
					return;
				}
				if(map.containsKey(A[i])){
					if(map.get(A[i]) == 1) {
						map.put(A[i], 2);
						ans = ans * 2 % 1000000007;
					} else {
						System.out.println(0);
						return;
					}
				} else {
					map.put(A[i], 1);
				}
			}
		}
		System.out.println(ans);
	}
}
