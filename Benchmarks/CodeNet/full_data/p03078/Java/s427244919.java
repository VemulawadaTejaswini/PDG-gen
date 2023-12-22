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
		long[] B = new long[Y];
		for(int i = 0; i < Y; i++)
			B[i] = sc.nextLong();
		long[] C = new long[Z];
		for(int i = 0; i < Z; i++)
			C[i] = sc.nextLong();
		long[] tasteAB = new long[X*Y];
		List<Long> taste = new ArrayList<>();
		for(int i = 0; i < X; i++) {
			for(int j = 0; j < Y; j++)
				tasteAB[i*Y+j] = A[i] + B[j];
		}
		Arrays.sort(tasteAB);
		for(int i = X*Y-1; i >= 0; i--) {
			if(i < X*Y-K)
				break;
			for(int j = 0; j < Z; j++) {
				taste.add(tasteAB[i]+ C[j]);
			}
		}
		Collections.sort(taste, Collections.reverseOrder());
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < K; i++)
			ans.append(taste.get(i) + "\n");
		System.out.println(ans);
	}

}
