import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();

		int K = scanner.nextInt();

		int[] scannerArray = new int[N];

		for (int index = 0; index < N; index++) {
			scannerArray[index] = scanner.nextInt();
		}

		int[] array = new int[N*K];

		for(int indexK = 0; indexK < K; indexK++) {
			for(int indexN = 0; indexN < N; indexN++) {
				array[indexK*N + indexN] = scannerArray[indexN];
			}
		}

//		int[] array = {3, 2, 1, 3, 2, 1,3,2,1,3,2,1,3,2,1,3,2,1};





		log(countSwapBabbleSort(array) % (1000000000 + 7));


	}


	/**
	 * バブルソートの交換数を算出
	 * ※転倒数
	 * @param array
	 * @return
	 */
	private static int countSwapBabbleSort(int[] array) {
		int ans = 0;
		int[] binary = new int[array.length + 1];

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
	private static int sum(int[] bit,int idx) {
        int ret = 0;
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

	private static void log(double str) {
		System.out.println(str);
	}

}

