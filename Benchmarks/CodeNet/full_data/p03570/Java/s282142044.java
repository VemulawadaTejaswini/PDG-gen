package google;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static boolean tag = true;
	static HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

	public static void setOut() throws FileNotFoundException {
		System.setOut(new PrintStream("C:\\Users\\itc200\\Desktop\\goo\\out"));
		File file = new File("C:\\Users\\itc200\\Desktop\\goo\\in");
		InputStream in = new FileInputStream(file);
		sc = new Scanner(in);
	}

	static long[][][][] dp;
	static int[][] data;

	public static void main(String[] args) throws Exception {
		// setOut();

		String str = sc.nextLine();
		int res = helper(str);
		System.out.println(res);

	}

	private static int helper(String str) {
		// TODO Auto-generated method stub
		int[][] res = new int[str.length()][26];
		int[] dp = new int[str.length()];
		res[0][str.charAt(0) - 'a']++;
		for (int i = 1; i < str.length(); i++) {
			res[i] = Arrays.copyOf(res[i - 1], 26);
			res[i][str.charAt(i) - 'a']++;
		}
		dp[0] = 1;

		for (int i = 1; i < dp.length; i++) {
			dp[i] = Integer.MAX_VALUE;
			if (isPar(res[i]))
				dp[i] = 1;
			else {
				for (int j = 0; j < i; j++) {
					int[] tmp2Map = res[j];
					int[] tmp = Arrays.copyOf(res[i], 26);
					for (int n = 0; n < tmp.length; n++)
						tmp[n] -= tmp2Map[n];
					if (isPar(tmp)) {

						dp[i] = Math.min(dp[i], dp[j] + 1);
					}
				}
			}
		}
		return dp[dp.length - 1];
	}

	private static boolean isPar(int[] is) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < is.length; i++) {
			if (is[i] % 2 != 0)
				count++;
			if (count > 1)
				return false;
		}
		return true;
	}

}