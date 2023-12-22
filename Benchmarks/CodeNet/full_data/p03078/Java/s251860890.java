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
		List<Long> tasteAB = new ArrayList<>();
		List<Long> taste = new ArrayList<>();
		for(int i = 0; i < X; i++) {
			for(int j = 0; j < Y; j++)
				tasteAB.add(A[i] + B[j]);
		}
		Collections.sort(tasteAB, Collections.reverseOrder());
		for(int i = 0; i < tasteAB.size() || i < K; i++) {
			for(int j = 0; j < Z; j++) {
				taste.add(tasteAB.get(i) + C[j]);
			}
		}
		Collections.sort(taste, Collections.reverseOrder());
		for(int i = 0; i < K; i++)
			System.out.println(taste.get(i));
	}

}
