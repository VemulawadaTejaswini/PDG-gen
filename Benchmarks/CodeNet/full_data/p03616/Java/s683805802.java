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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	public static void main(String[] args) {
		int X = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[K + 1];
		for (int i = 1; i <= K; i++) {
			arr[i] = sc.nextInt();
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			int time = sc.nextInt();
			int init = sc.nextInt();
			int ii = 1;
			while (true) {
				int value = 0;
				if(ii==arr.length)
					value=time-arr[ii-1];
				else if (arr[ii] >= time)
					value = time - arr[ii - 1];
				else
					value = arr[ii] - arr[ii - 1];
				
				if ((ii & 1) != 0) {
					value = 0 - value;
				}

				if (value + init < 0)
					init = 0;
				else if (value + init > X)
					init = X;
				else
					init = value + init;

				if (ii==arr.length||arr[ii] >= time)
					break;
				++ii;
			}
			System.out.println(init);
		}

	}

	private static int helper(int[] arr) {
		// TODO Auto-generated method stub
		int res = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] == i && arr[i + 1] == (i + 1)) {
				int tmp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = tmp;
				++i;
				++res;
			}
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == i) {
				++res;
			}
		}
		return res;
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