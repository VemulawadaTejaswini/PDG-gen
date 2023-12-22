import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int[] A = new int[N];
	static {
		Arrays.setAll(A, i -> Integer.parseInt(sc.next()));
	}
	public static void main(String[] args) {
		Arrays.sort(A);
		List<Integer> yakusuu = new ArrayList<>();
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
//				yakusuu.add(doEuclideanAlgorithm(A[i], A[j]));
				yakusuu.add(gcd(A[i], A[j]));
			}
		}
		yakusuu.sort(Comparator.naturalOrder());
		System.out.println(yakusuu.get(0));
	}
    private static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
//    private static int doEuclideanAlgorithm(int x, int y) {
//        int biggerNum = Math.max(x, y);
//        int smallerNum = Math.min(x, y);
//
//        // 大きい方から小さい方を割った余を求める
////        if (smallerNum == 0) {
////            return biggerNum;
////        }
//        int surplus = biggerNum % smallerNum;
//
//        // 割り切れていれば、それを返す
//        if (surplus == 0) {
//            return smallerNum;
//        }
//        // 割り切れなければ再帰的に自信を呼び出す
////        surplus = doEuclideanAlgorithm(smallerNum, surplus);
//        surplus = doEuclideanAlgorithm(smallerNum, surplus);
//
//        return surplus;
//    }
}
