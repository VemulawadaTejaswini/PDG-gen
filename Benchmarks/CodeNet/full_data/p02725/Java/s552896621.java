import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int K = sc.nextInt();
		final int N = sc.nextInt();
		final Integer[] A = new Integer[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		int min = Integer.MAX_VALUE;
		List<List<Integer>> list = Permutation.get(A);
		for(List<Integer> d : list) {
			// System.out.println("#" +  Arrays.asList(d));
			int move = 0, mae = d.get(0);
			for(int i = 1; i < d.size(); i++) {
				int a = d.get(i);
				int p1 = a < mae ? Math.abs(mae - a) : mae + (K - a); // 左回りの距離
				int p2 = a < mae ? (K - mae) + a : Math.abs(mae - a); // 右回りの距離
				move = move + Math.min(p1, p2);
				mae = a;
			}
			// System.out.println("min=" + min + " move=" + move);
			if(move < min) min = move;
		}
		System.out.println(min);
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