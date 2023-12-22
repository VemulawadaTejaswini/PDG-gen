import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[X];
		for(int i = 0; i < X; i++)
			A[i] = sc.nextLong();
		Arrays.sort(A);
		long[] B = new long[Y];
		for(int i = 0; i < Y; i++)
			B[i] = sc.nextLong();
		Arrays.sort(B);
		long[] C = new long[Z];
		for(int i = 0; i < Z; i++)
			C[i] = sc.nextLong();
		Arrays.sort(C);
		List<Long> tasteAB = new ArrayList<>();
		List<Long> taste = new ArrayList<>();
		for(int i = 0; i < X; i++) {
			for(int j = 0; j < Y; j++) {
				if((i+1)*(j+1) > K)
					break;
				tasteAB.add(A[i] + B[j]);
			}
		}
		Collections.sort(tasteAB, Collections.reverseOrder());
		for(int i = 0; i < tasteAB.size(); i++) {
			if(i > K)
				break;
			for(int j = 0; j < Z; j++) {
				if((i+1)*(j+1) > K)
					break;
				taste.add(tasteAB.get(i) + C[j]);
			}
		}
		Collections.sort(taste, Collections.reverseOrder());
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < K; i++)
			ans.append(taste.get(i) + "\n");
		System.out.println(ans);
	}

}