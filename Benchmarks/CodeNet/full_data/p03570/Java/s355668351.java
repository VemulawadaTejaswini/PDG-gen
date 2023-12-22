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

	public static int helper(String s) {
	    char[] c = s.toCharArray();
	    int n = c.length;
	    int[] cut = new int[n];
	    boolean[][] pal = new boolean[n][n];
	    
	    for(int i = 0; i < n; i++) {
	        int min = i;
	        for(int j = 0; j <= i; j++) {
	            if(c[j] == c[i] && (j + 1 > i - 1 || pal[j + 1][i - 1])) {
	                pal[j][i] = true;  
	                min = j == 0 ? 0 : Math.min(min, cut[j - 1] + 1);
	            }
	        }
	        cut[i] = min;
	    }
	    return cut[n - 1];
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