import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[][] data = new int[n][2];
		for (int i = 0; i < n; i++) {
			data[i][0] = sc.nextInt();
			data[i][1] = sc.nextInt();
		}
		System.out.println(solve(h, data));
	}

	private static int solve(int h, int[][] data) {
		// TODO Auto-generated method stub
		List<int[]> l = new ArrayList<int[]>();
		for (int[] i : data)
			l.add(i);
		Collections.sort(l, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if (o1[0] != o2[0])
					return o2[0] - o1[0];
				return o1[1] - o2[1];
			}
		});
		int[] tmp = l.get(0);
		l.remove(0);
		Collections.sort(l, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o2[1] - o1[1];
			}
		});
		int count = 0;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i)[1] >= tmp[0]) {
				h = h - l.get(i)[1];
				++count;
			} else {
				break;
			}
			if (h <= 0)
				return count;
		}
		if (tmp[1] < tmp[0])
			tmp[1] = tmp[0];
		++count;
		h = h - tmp[1];
		if (h <= 0)
			return count;

		count = count + h / tmp[0];
		if (h % tmp[0] != 0)
			count++;
		return count;

	}

}