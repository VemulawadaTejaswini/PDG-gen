import java.util.Scanner;

public class Main {
	
	public long solve(long N, long X) {
		long longEdge = Math.max(X, N-X);
		long shortEdge = Math.min(X, N-X);
		
		long length = X + N - X;

		// 短編shortEdge, 長編longEdgeの平行四辺形の中を反射する距離を求める
		while (shortEdge > 0) {
			long num = longEdge / shortEdge;
			length += (shortEdge * num * 2);

			// num * 2回反射して、longEdge - shortEdge * numが残る
			long left = longEdge - (shortEdge * num);
			longEdge = shortEdge;
			shortEdge = left;
		}
		
		// 1回分行き過ぎるので、戻す
		length -= longEdge;
		
		return length;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long X = in.nextLong();
		in.close();
		
		Main main = new Main();
		long result = main.solve(N, X);
		
		System.out.println(result);
	}
}