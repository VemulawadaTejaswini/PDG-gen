import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Baby[] A = new Baby[N];

		for (int i = 0; i < N; i++) {
			A[i] = new Baby();
			A[i].activity = sc.nextInt();
			A[i].firstOrder = i;
		}

		Arrays.sort(A);

		long ans = 0;
		long rightOccupied=1;
		long leftOccupied=1;

		for(Baby b:A) {
			if(b.firstOrder>=N/2) {
				ans+=b.activity*(b.firstOrder+1-leftOccupied);
				leftOccupied++;
			}else {
				ans+=b.activity*((N-rightOccupied+1)-(b.firstOrder+1));
				rightOccupied++;
			}
		}

		System.out.println(ans);
	}



	//	//二分探索
	//k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray) {
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedArray[mid] <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//二分探索
	//k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList) {
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while (upperBorder - lowerBorder > 1) {
			mid = (upperBorder + lowerBorder) / 2;
			if (orderedList.get(mid) <= num) {
				lowerBorder = mid;
			} else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

}
class Baby implements Comparable<Baby> {
	long activity;
	long firstOrder;

	@Override
	public int compareTo(Baby otherBaby) {
		if (otherBaby.activity < this.activity) {
			return -1;
		} else if (otherBaby.activity > this.activity) {
			return 1;
		} else{
			return 0;
		}
	}
}
