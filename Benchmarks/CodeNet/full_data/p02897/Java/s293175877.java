import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		double N = scanner.nextInt();

		if(N % 2 == 0) {
			// 偶数
			log(0.5);
		} else {
			// 奇数
			log(((N - 1) / 2 + 1 )/ N);
		}



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

