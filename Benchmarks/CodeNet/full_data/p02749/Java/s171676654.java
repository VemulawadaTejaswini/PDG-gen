import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		Node2[] arr = new Node2[n];
		for (int i = 0; i < n; i++) {
			Node2 o = new Node2();
			arr[i] = o;
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			arr[a].nexts.add(b);
			arr[b].nexts.add(a);
		}
		br.close();

		Queue<Integer> que = new ArrayDeque<>();
		que.add(0);
		arr[0].grp = 1;
		while (!que.isEmpty()) {
			int cur = que.poll();
			for (int next : arr[cur].nexts) {
				if (arr[next].grp == 0) {
					que.add(next);
					arr[next].grp = 3 - arr[cur].grp;
				}
			}
		}

		int[] rem = new int[4];
		int n2 = n / 3;
		rem[1] = n2;
		rem[2] = n2;
		rem[3] = n2;
		int n3 = n % 3;
		if (n3 > 0) rem[1]++;
		if (n3 > 1) rem[2]++;

		int[] cnt = new int[3];
		for (int i = 0; i < n; i++) {
			cnt[arr[i].grp]++;
		}
		int mincnt = cnt[1];
		int mingrp = 1;
		if (cnt[1] > cnt[2]) {
			mincnt = cnt[2];
			mingrp = 2;
		}

		int[] ans = new int[n];
		if (mincnt <= rem[3]) {
			for (int i = 0; i < n; i++) {
				if (arr[i].grp == mingrp) {
					ans[i] = rem[3] * 3;
					rem[3]--;
				} else {
					for (int j = 1; j <= 3; j++) {
						if (rem[j] > 0) {
							rem[j]--;
							ans[i] = rem[j] * 3 + j;
							break;
						}
					}
				}
			}
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= 3; j++) {
					if (arr[i].grp == j && rem[j] > 0 || j == 3) {
						rem[j]--;
						ans[i] = rem[j] * 3 + j;
						break;
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(ans[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}

	static class Node2 {
		int grp;
		Integer target;
		List<Integer> nexts = new ArrayList<>();
	}
}
