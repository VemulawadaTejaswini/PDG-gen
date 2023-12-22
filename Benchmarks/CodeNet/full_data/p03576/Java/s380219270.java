import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Usr {
	int count = 0;
	Map<Integer, String> m = new HashMap<Integer, String>();
	Set<String> name = new HashSet<String>();
	Set<String> mail = new HashSet<String>();
}

public class Main {
	static boolean debug = true;
	static Scanner sc = new Scanner(System.in);
	static long res = Long.MAX_VALUE;
	static long[][] point;
	static int K;

	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		K = sc.nextInt();
		point = new long[n][2];
		for (int i = 0; i < n; i++) {
			point[i][0] = sc.nextLong();
			point[i][1] = sc.nextLong();
		}
		for (int x1 = 0; x1 < n; x1++) {
			for (int x2 = x1 + 1; x2 < n; x2++) {
				long[][] px = { point[x1], point[x2] };
				helper(px);
				for (int x3 = x2 + 1; x3 < n; x3++) {
					long[][] px1 = { point[x1], point[x2], point[x3] };
					helper(px1);
					for (int x4 = x3 + 1; x4 < n; x4++) {
						long[][] px2 = { point[x1], point[x2], point[x3], point[x4] };
						helper(px2);
					}
				}
			}
		}
		System.out.println(res);
	}

	private static void helper(long[][] px) {
		// TODO Auto-generated method stub

		long left = Long.MAX_VALUE;
		long right = Long.MIN_VALUE;
		long down = Long.MAX_VALUE;
		long top = Long.MIN_VALUE;

		for (int i = 0; i < px.length; i++) {
			left = Math.min(left, px[i][0]);
			right = Math.max(right, px[i][0]);
			down = Math.min(down, px[i][1]);
			top = Math.max(top, px[i][1]);
		}
	
		long size = (top - down) * (right - left);

		if (size > res)
			return;
		int count = 0;
		for (int i = 0; i < point.length; i++) {

			if (point[i][0] >= left && point[i][0] <= right && point[i][1] <= top && point[i][1] >= down)
				count++;
			if (count == K)
				break;
		}
		if (count == K)
			res = Math.min(res, size);

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