import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		String[] line1 = br.readLine().split(" ");
		int n = Integer.parseInt(line1[0]);
		int m = Integer.parseInt(line1[1]);

		if(n <= m) {
			String[] line2 = br.readLine().split(" ");
			int[] arr = new int[m];
			for(int i = 0; i < m; i++) {
				arr[i] = Integer.parseInt(line2[i]);
			}

			Arrays.sort(arr);

			Distances[] dists = new Distances[m-1];

			for(int i = 0; i < m-1; i++) {
				dists[i] = new Distances(arr[i+1]-arr[i], i);
			}

			Arrays.sort(dists, new DistanceComparator());
			// for(Distances d : dists) {
			// 	System.out.println(d.getDistance());
			// }

			int[] newDists = new int[n-1];
			for(int i = dists.length-n+1; i < dists.length; i++) {
				int currIndex = i - (dists.length-n+1);
				newDists[currIndex] = dists[i].getIndex();
			}
			Arrays.sort(newDists);

			int ans = 0;
			for(int i = 0; i < newDists.length-1; i++) {
				int indexA = newDists[i]+1;
				int indexB = newDists[i+1];
				ans += (arr[indexB] - arr[indexA]);
			}
			ans += (arr[newDists[0]] - arr[0]);
			ans += (arr[m-1] - arr[newDists[newDists.length-1]+1]);

			// System.out.println(Arrays.toString(newDists));
			System.out.println(ans);
		}
		else {
			System.out.println(0);
		}
	}

	private static class Distances {
		int distance;
		int index;

		public Distances(int d, int i) {
			distance = d;
			index = i;
		}

		public int getDistance() {
			return distance;
		}

		public int getIndex() {
			return index;
		}
	}

	private static class DistanceComparator implements Comparator<Distances> {
		public int compare(Distances d1, Distances d2) {
			Integer a = new Integer(d1.getDistance());
			Integer b = new Integer(d2.getDistance());
			return a.compareTo(b);
		}
	}
}