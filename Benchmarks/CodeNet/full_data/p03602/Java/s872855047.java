import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

class a {
	public a(int i, int j, int k) {
		p1 = i;
		p2 = j;
		length = k;
	}

	int p1;
	int p2;
	int length;
}

public class Main {
	static boolean debug = true;
	static Scanner sc = new Scanner(System.in);
	static int[][] map;

	public static void main(String[] args) {
		int n = sc.nextInt();
		map = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		System.out.println(helper(map));

	}

	private static int helper(int[][] map) {
		// TODO Auto-generated method stub

		if (!floyd(map))
			return -1;
		int[] dis = new int[map.length];
		Map<Integer, Set<Integer>> m = new HashMap<Integer, Set<Integer>>();
		for (int i = 0; i < map.length; i++) {
			Set<Integer> tmp = new HashSet();
			tmp.add(i);
			m.put(i, tmp);
		}
		List<a> l = new ArrayList<a>();
		for (int i = 0; i < map.length; i++)
			for (int j = i + 1; j < map.length; j++)
				l.add(new a(i, j, map[i][j]));
		List<a> l1 = new ArrayList<a>();
		Collections.sort(l, (a, b) -> (int)a.length -(int) b.length);
		int count = 0;
		for (int i = 0; i < l.size(); i++) {
			a tmp = l.get(i);


			if (!(m.get(tmp.p1).contains(tmp.p2))) {
				l1.add(tmp);
				count += tmp.length;
				Set<Integer> tmps = m.get(tmp.p1);
				tmps.addAll(m.get(tmp.p2));
				for (int value : tmps) {
					m.put(value, tmps);
				}
				m.put(tmp.p2, m.get(tmp.p1));
			} else {
				int tmpi = intest(tmp, l1);

				if (map[tmp.p1][tmp.p2] < tmpi)
					count += map[tmp.p1][tmp.p2];
				l1.add(tmp);
			}

		}

		return count;
	}

	private static int intest(a tmp, List<a> l1) {
		// TODO Auto-generated method stub
		int[][] tmpmap = new int[map.length][map.length];
		for(int i=0;i<map.length;i++)
			for(int j=0;j<map.length;j++)
				tmpmap[i][j]=1000483647;
		for (a aa : l1){
			tmpmap[aa.p1][aa.p2] = aa.length;
			tmpmap[aa.p2][aa.p1]=aa.length;
		}
		floyd2(tmpmap);

		return tmpmap[tmp.p1][tmp.p2];
	}

	private static boolean floyd(int[][] map) {
		// TODO Auto-generated method stub
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				for (int k = 0; k < map.length; k++) {
					if (k != i && k != j) {
						if (map[i][k] + map[k][j] < map[i][j])
							return false;
					}
				}
			}
		}
		return true;
	}
	private static void floyd2(int[][] map) {
		// TODO Auto-generated method stub
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				for (int k = 0; k < map.length; k++) {
					if (k != i && k != j) {
						if (map[i][k] + map[k][j] < map[i][j])
							map[i][j]=map[i][k] + map[k][j];
					}
				}
			}
		}

	}

	private static void print(String string) {
		// TODO Auto-generated method stub
		if (debug)
			System.out.println(string);
	}

	private static void print(int[] data) {
		if (debug) {
			for (int i = 0; i < data.length; i++)
				System.out.println(i + ":" + data[i]);
		}
	}

	private static void print(String[] data) {
		if (debug) {
			for (int i = 0; i < data.length; i++)
				System.out.println(i + ":" + data[i]);
		}
	}

	private static void print(char[] data) {
		if (debug) {
			for (int i = 0; i < data.length; i++)
				System.out.println(i + ":" + data[i]);
		}
	}

	private static void print(double[] data) {
		if (debug) {
			for (int i = 0; i < data.length; i++)
				System.out.println(i + ":" + data[i]);
		}
	}

	private static void print(long[] data) {
		if (debug) {
			for (int i = 0; i < data.length; i++)
				System.out.println(i + ":" + data[i]);
		}
	}

	private static void print(int[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					System.out.print(data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	private static void print(long[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					System.out.print(data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	private static void print(char[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					System.out.print(i + " " + j + ":" + data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	private static void print(String[][] data) {

		if (debug) {
			for (int i = 0; i < data.length; i++) {
				for (int j = 0; j < data[0].length; j++) {
					System.out.print(i + " " + j + ":" + data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	private static void print(double[][] data) {

		if (debug) {
			for (int i = 0; i < data[0].length; i++) {
				for (int j = 0; j < data.length; j++) {
					System.out.print(i + " " + j + ":" + data[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void inPutData(char[][] c) {
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextLine().toCharArray();
		}
	}

}