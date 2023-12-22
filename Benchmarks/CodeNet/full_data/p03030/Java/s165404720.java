import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

class Cmp implements Comparator<String[]> {

	@Override
	public int compare(String[] arg0, String[] arg1) {
		// TODO Auto-generated method stub
		if (arg0[0].equals(arg1[0])) {
			return Integer.parseInt(arg1[1])-Integer.parseInt(arg0[1]);
		}
		return arg0[0].compareTo(arg1[0]);
	}
}

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Properties pps = System.getProperties();
	static boolean dbg = true;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// setOut();

		int n = sc.nextInt();
		ns();
		String[][] data = new String[n][];
		for (int i = 0; i < n; i++) {
			String str=sc.nextLine() + " " + (i + 1);

			data[i] =str.split(" ");

		}

		Arrays.sort(data, new Cmp());
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i][2]);
		}

	}


	private static void setOut() throws FileNotFoundException {
		sc = new Scanner(new FileInputStream("in.txt"));
		System.setOut(new PrintStream(new FileOutputStream("out.txt")));

	}

	private static void out(List<Integer> l) {
		// TODO Auto-generated method stub
		for (int i : l)
			System.out.println(i);

	}

	private static void out(int[] b) {
		// TODO Auto-generated method stub
		for (int i : b)
			System.out.println(i);

	}

	public static void out(String str) {

		if (dbg)
			System.out.println(str);
	}

	public static void out(int str) {

		if (dbg)
			System.out.println(str);
	}

	public static int ni() {

		return sc.nextInt();

	}

	public static String ns() {

		return sc.nextLine();
	}

	public static int[] ni(int k) {
		int[] res = new int[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextInt();
		sc.nextLine();
		return res;
	}

	public static String[] ns(int k) {
		String[] res = new String[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextLine();
		return res;
	}

	public static int[][] ni(int a, int b) {
		int[][] res = new int[a][b];
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				res[i][j] = sc.nextInt();
		sc.nextLine();
		return res;
	}
}
