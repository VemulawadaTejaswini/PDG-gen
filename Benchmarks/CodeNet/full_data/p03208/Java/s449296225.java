import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static int[] minSegment;
	private static int[] maxSegment;

	private static int n;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		List<Integer> values = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			values.add(sc.nextInt());
		}

		Collections.sort(values);

		makeSegment(values);
		int minVal = Integer.MAX_VALUE;
		for(int i = 0; i + k < n; i++) {
			int dif = getMaxVal(i, i + k -1) - getMinVal(i, i + k - 1);
			minVal = Math.min(minVal, dif);
		}

		System.out.println(minVal);

	}

	private static void makeSegment(List<Integer> values) {
		double d =  Math.sqrt(values.size() * 2);
		int i = (int)d;
		if(i < d) {
			i++;
		}

		n = (int) Math.pow(2, i);

		int segLen = 2 * n - 1;

		minSegment = new int[segLen];
		for(int j = 0; j < segLen; j++) {
			minSegment[j] = Integer.MAX_VALUE;
		}
		maxSegment = new int[segLen];

		for(int j = 0; j < values.size(); j++) {
			int segIdx = n + j - 1;
			updateSegment(segIdx, values.get(j));
		}

	}

	private static void updateSegment(int idx, int val) {

		minSegment[idx] = val;
		maxSegment[idx] = val;

		while(idx > 0) {
			idx = (idx-1)/2;
			minSegment[idx] = Math.min(minSegment[2*idx + 1], minSegment[2*idx + 2]);
			maxSegment[idx] = Math.max(maxSegment[2*idx + 1], maxSegment[2*idx + 2]);
		}
	}

	private static int getMinVal(int l, int r) {
		int minVal = Integer.MAX_VALUE;

		l = n + l - 1;
		r = n + r - 1;

		if(l % 2 != 0) {
			minVal = minSegment[l];
		}
		if(r % 2 == 0) {
			minVal = Math.min(minVal, minSegment[r]);
		}

		while(l<r) {
			l = (l-1)/2;
			r = (r-1)/2;

			if(l == r) {
				break;
			}

			if(l % 2 != 0) {
				minVal = Math.min(minVal, minSegment[r]);
			}
			if(r % 2 == 0) {
				minVal = Math.min(minVal, minSegment[r]);
			}
		}

		return minVal;
	}

	private static int getMaxVal(int l, int r) {
		int maxVal = 0;

		l = n + l - 1;
		r = n + r - 1;

		if(l % 2 != 0) {
			maxVal = maxSegment[l];
		}
		if(r % 2 == 0) {
			maxVal = Math.max(maxVal, maxSegment[r]);
		}

		while(l<r) {
			l = (l-1)/2;
			r = (r-1)/2;

			if(l == r) {
				break;
			}

			if(l % 2 != 0) {
				maxVal = Math.max(maxVal, maxSegment[r]);
			}
			if(r % 2 == 0) {
				maxVal = Math.max(maxVal, maxSegment[r]);
			}
		}

		return maxVal;
	}
}

