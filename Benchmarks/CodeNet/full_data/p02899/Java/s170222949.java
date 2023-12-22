import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int[] ans = new int[N];

		int A = 0;

		for(int index = 0; index < N; index++) {
			ans[scanner.nextInt() - 1] = index + 1;
		}

		for(int index = 0; index < N; index++) {
			log(ans[index]);
		}

//		long A = scanner.nextLong();
//
//		long B = scanner.nextLong();
//
//		Vector<Integer> kouyakusuu = new Vector<>();
//		Vector<Integer> kouyakusuuB = new Vector<>();
//
//		int ans = 0;
//
//		for(int index = 1; index < A / 2; index++) {
//			if(A % index == 0) {
//				// 公約数
//				kouyakusuu.add(index);
//			}
//		}
//
//		for (int index = 0; index < kouyakusuu.size(); index++) {
//			if(B % kouyakusuu.get(index) == 0) {
//				kouyakusuuB.add(kouyakusuu.get(index));
//			}
//		}
//
//		for (int index = 0; index < kouyakusuuB.size(); index++) {
//			if(isPrimeNumber( kouyakusuuB.get(index))) {
//				ans++;
//			}
//		}
//
//		log(ans);

	}

	private static boolean isPrimeNumber( long num ){
		// 1以下は素数ではない
		if ( 1 >= num ) return true;

		// 2の場合は素数
		if ( 2 == num ) return true;

		// 素数判定
		long n = (long)Math.sqrt( num );
		for ( long i = 2; i <= n; ++ i ) {
			// 余り0で割り切れるかを判定
			if ( 0 == ( num % i ) ) return false;
		}

		// numが2～nで割り切れなかったので素数
		return true;
	}

	private static void dfs(int[] treeArray,int parrent, int children) {
		Vector<Vector> aa = new Vector<>();
		Vector<Integer> bb = new Vector<>();
		bb.add(1);
		aa.add(bb);
	}


	/**
	 * バブルソートの交換数を算出
	 * ※転倒数
	 * @param array
	 * @return
	 */
	private static long countSwapBabbleSort(int[] array, int N) {
		long ans = 0;
		int[] binary = new int[N + 1];

		for (int index = 0; index < array.length; index++) {
			ans = ans + (index - sum(binary, array[index]));
			add(binary, array[index], 1);
		}
		return ans;
	}

    //add value at idx on bit O(logN)
	private static void add(int[] bit,int idx,int value) {
        for(int i=idx;i<bit.length;i=i+(i&-i)) {
        	bit[i] += value;
        }
    }

    //return sum [1,idx] O(logN)
	private static long sum(int[] bit,int idx) {
        long ret = 0;
        for(int i=idx;i>0;i-=(i&-i)) {
        	ret += bit[i];
        }
        return ret;
    }

	private static void log(String str) {
		System.out.println(str);
	}

	private static void log(int str) {
		System.out.println(str);
	}

	private static void log(long str) {
		System.out.println(str);
	}

	private static void log(double str) {
		System.out.println(str);
	}

	private static void log(BigInteger str) {
		System.out.println(str);
	}

}

