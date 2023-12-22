import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
		sc.close();

		// N個の町を訪れる経路の通りパターン数の取得
		Integer[] perm = new Integer[N];
		for(int i = 0; i < N; i++) {
			perm[i] = i + 1;
		}
		List<List<Integer>> permList = Permutation.get(perm);

		double sum = 0.0;
		int size = permList.size();

		// N個の町を訪れる経路の通りパターンから距離の計算
        for (List<Integer> comb : permList) {
			int x1 = Integer.MAX_VALUE;
			int y1 = Integer.MAX_VALUE;
			for(Integer c : comb) {
				if(x1 == Integer.MAX_VALUE && y1 == Integer.MAX_VALUE) {
					x1 = X[c - 1];
					y1 = Y[c - 1];
					continue;
				}
				int x2 = X[c - 1];
				int y2 = Y[c - 1];
				double xy = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
				sum += xy;
				// System.out.println("sum " + sum + " xy = " + xy + " : " + x1 + " " + x2 + " " + y1 + " " + y2);
				x2 = x1;
				y2 = y1;
			}
        }
		System.out.println(sum / size);
	}
}
/**
 * 順列生成
 */
class Permutation {

    /**
     * 順列のリストを返す
     * 
     * @param <T>
     * @param data 生成元配列
     * @return 順列リスト
     */
    public static <T> List<List<T>> get(final T[] data) {
		return permutation(data);
	}

    /**
     * 順列のリストを出力する
     * 
     * @param <T>
     * @param data 生成元配列
     */
    public static <T> void print(final T[] data) {
        int number = 0;
        for (final List<T> comb : permutation(data)) {
            System.out.println("#" + ++number + " " + Arrays.asList(comb));
        }
	}
    
    /**
     * 順列リストを作成する
     * @param <T>
     * @param data 生成元配列
     * @return 順列リスト
     */
    private static <T> List<List<T>> permutation(final T[] data) {
        final List<List<T>> result = new ArrayList<List<T>>();
		// 候補の配列
		final List<T> candidate = new ArrayList<>(Arrays.asList(data));
		// 順列の配列
		final List<T> perm = new ArrayList<>();
		permutation(candidate, perm, result);
        return result;
    }
	
    /**
     * 再帰呼び出し
     * @param <T>
     * @param candidate 候補の配列
     * @param perm 順列の配列
     * @param result 順列のリスト
     */    
    private static <T> void permutation(final List<T> candidate, final List<T> perm, final List<List<T>> result) {
		if(candidate.size() == 0) {
			result.add(perm);
		}
		for(int i = 0; i < candidate.size(); i++) {
			final List<T> p = new ArrayList<>(perm);
			final List<T> c = new ArrayList<>(candidate);
			p.add(c.get(i));
			c.remove(i);
			permutation(c, p, result);
		}
	}
}