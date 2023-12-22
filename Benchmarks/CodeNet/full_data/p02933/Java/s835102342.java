import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);


		int A = scanner.nextInt();

		String S = scanner.next();

//		int[] scannerArray = new int[N];
//
//		int maxNumber = 0;
//		int number = 0;
//
//		for (int index = 0; index < N; index++) {
//			number = scanner.nextInt();
//			scannerArray[index] = number;
//
//		}

		if(A < 3200) {
			log("red");
		} else {
			log(S);
		}


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

