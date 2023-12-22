import java.util.*;
import java.io.*;

public class Main {
	private static class Pair {
		int first;
		int second;

		Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Pair[] redPoints = new Pair[n];
		for(int i = 0; i < n; ++i) {
			redPoints[i] = new Pair(sc.nextInt(), sc.nextInt());
		}

		Pair[] bluePoints = new Pair[n];
		for(int i = 0; i < n; ++i) {
			bluePoints[i] = new Pair(sc.nextInt(), sc.nextInt());
		}

		Arrays.sort(redPoints, new Comparator<Pair>() {
			@Override
			public int compare(Pair p, Pair q) {
				if(p.first != q.first) return q.first - p.first;
				else return q.second - p.second;
			}
		});

		Arrays.sort(bluePoints, new Comparator<Pair>() {
			@Override
			public int compare(Pair p, Pair q) {
				if(p.first != q.first) return q.first - p.first;
				else return q.second - p.second;
			}
		});

		int ans = 0;
		boolean[] used = new boolean[n];
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				if(!used[j] && redPoints[i].first < bluePoints[j].first &&
					redPoints[i].second < bluePoints[j].second) {
					ans++;
					used[j] = true;
					break;
				}
			}
		}

		Arrays.sort(redPoints, new Comparator<Pair>() {
			@Override
			public int compare(Pair p, Pair q) {
				if(p.first != q.first) return p.first - q.first;
				else return p.second - q.second;
			}
		});

		Arrays.sort(bluePoints, new Comparator<Pair>() {
			@Override
			public int compare(Pair p, Pair q) {
				if(p.first != q.first) return p.first - q.first;
				else return p.second - q.second;
			}
		});

		int ans2 = 0;
		boolean[] used = new boolean[n];
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				if(!used[j] && redPoints[i].first < bluePoints[j].first &&
					redPoints[i].second < bluePoints[j].second) {
					ans2++;
					used[j] = true;
					break;
				}
			}
		}

		System.out.println(Math.max(ans, ans2));
	}
}