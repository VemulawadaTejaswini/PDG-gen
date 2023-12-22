import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Map<Integer, Integer> x = new HashMap<>();
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if(x.containsKey(A[i]))
				x.put(A[i], x.get(A[i])+1);
			else
				x.put(A[i], 1);
		}
		long ans = 0;
		for(int i : x.values())
			ans += (long)i*(i-1)/2;
		for(int i = 0; i < N; i++)
			System.out.println(ans - (x.get(A[i])-1));

	}

}
