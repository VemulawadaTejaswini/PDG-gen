import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { -1, 0, 1, 0 };
	static long MOD = (long) (1e9 + 7);
	static Random random = new Random();

	static boolean isAnswerFound = false;
	
	static int N;
	static int K;
	static int C;
	static Set<Integer> answers;
	static char[] s;
	static TreeSet<Integer> workingDays;

	public static void main(String[] args) {
		FastReader in = new FastReader();

		N = in.nextInt();
		K = in.nextInt();
		C = in.nextInt();
		s = in.next().toCharArray();

		answers = new TreeSet<Integer>();
		workingDays = new TreeSet<Integer>();
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'o') {
				answers.add(i);
				workingDays.add(i);
			}
		}

		TreeSet<Integer> tmp = new TreeSet<Integer>();
		for (Integer n : workingDays) {
			if (answers.contains(n)) {
				solve(n, tmp);
			}
		}

		Iterator<Integer> it = answers.iterator();
		while (it.hasNext()) {
			out(it.next() + 1);
		}
	}
	
	// Work at index. tmp doesn't contain the index yet.
	public static void solve(Integer index, TreeSet<Integer> tmp) {
		// There is no answers.
		if (answers.size() == 0) {
			return;
		}
		// Answer option
		if (tmp.size() == K) {
			Set<Integer> remove = new HashSet<Integer>();
			for (Integer n : answers) {
				if (!tmp.contains(n)) {
					remove.add(n);
				}
			}
			answers.removeAll(remove);
			return;
		}
		// Passed the N, but didn't work K days
		if (index == null || index >= N) {
			return;
		}
		// Option not working index.
		solve(workingDays.higher(index), tmp);
		// User worked this day
		tmp.add(index);
		solve(workingDays.higher(index + C), tmp);
		// Remove that day from tmp.
		tmp.remove(index);
	}

	public static void out(Object o) {
		System.out.println(o);
	}

	public static void print(Object o) {
		System.out.print(o);
	}

	public static void printNumArray(int[] nums) {
		System.out.printf("[");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d%s", nums[i], i != nums.length - 1 ? ", " : "");
		}
		System.out.println("]");
	}

	public static void printNumArray(long[] nums) {
		System.out.printf("[");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d%s", nums[i], i != nums.length - 1 ? ", " : "");
		}
		System.out.println("]");
	}

	public static void printDoubleArray(double[] nums) {
		System.out.printf("[");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%f%s", nums[i], i != nums.length - 1 ? ", " : "");
		}
		System.out.println("]");
	}

	public static void printDoubleList(List<List<Integer>> nums) {
		for (int i = 0; i < nums.size(); i++) {
			printNumList(nums.get(i));
		}
	}

	public static void printNumList(List<Integer> nums) {
		System.out.printf("[");
		for (int i = 0; i < nums.size(); i++) {
			System.out.printf("%d%s", nums.get(i), i != nums.size() - 1 ? ", " : "");
		}
		System.out.println("]");
	}

	public static void printStringList(List<String> list) {
		System.out.printf("[");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s%s", list.get(i), i != list.size() - 1 ? ", " : "");
		}
		System.out.println("]");
	}

	public static void printStringArray(String[] arr) {
		print("[");
		for (int i = 0; i < arr.length; i++) {
			print(String.format("%s%s", arr[i], i != arr.length - 1 ? ", " : ""));
		}
		out("]");
	}

	public static void printStringListOfStringList(List<List<String>> list) {
		for (int i = 0; i < list.size(); i++) {
			printStringList(list.get(i));
		}
	}

	public static void printNumListOfNumList(List<List<Integer>> num) {
		for (int i = 0; i < num.size(); i++) {
			printNumList(num.get(i));
		}
	}

	public static void printNumListOfNumArray(List<int[]> list) {
		for (int i = 0; i < list.size(); i++) {
			printNumArray(list.get(i));
		}
	}

	public static void printNum2DArray(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.printf("%2d ", map[i][j]);
			}
			System.out.println();
		}
	}

	public static void printNum2DArray(long[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.printf("%2d ", map[i][j]);
			}
			System.out.println();
		}
	}

	public static void printCharArray(char[] arr) {
		print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%c%s", arr[i], i == arr.length - 1 ? "" : ", ");
		}
		out("]");
	}

	public static void printChar2DArray(char[][] map) {
		for (char[] arr : map) {
			for (char c : arr) {
				print(String.format("%c ", c));
			}
			out("");
		}
	}

	public static void printBoolean2DArray(boolean[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				print(map[i][j] ? "T " : "F ");
			}
			out("");
		}
	}

	public static void printStringSet(Set<String> set) {
		for (String s : set) {
			out(s);
		}
	}

	/**
	 * Receives an integer and print in numBits from the right
	 * 
	 * @param n
	 * @param numBits
	 */
	public static void printBinary(int n, int numBitsFromRight) {
		String s = "";
		for (int i = numBitsFromRight - 1; i >= 0; i--) {
			s += (n & (1 << i)) > 0 ? "1" : "0";
		}
		out(s);
	}

	// Taken from
	// https://www.geeksforgeeks.org/c-program-find-gcd-hcf-two-numbers/
	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

class TreeDrawer {
	public static String treeNodeToString(TreeNode root) {
		if (root == null) {
			return "[]";
		}

		String output = "";
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.add(root);
		while (!nodeQueue.isEmpty()) {
			TreeNode node = nodeQueue.remove();

			if (node == null) {
				output += "null, ";
				continue;
			}

			output += String.valueOf(node.val) + ", ";
			nodeQueue.add(node.left);
			nodeQueue.add(node.right);
		}
		return "[" + output.substring(0, output.length() - 2) + "]";
	}

	public static TreeNode stringToTreeNode(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return null;
		}

		String[] parts = input.split(",");
		String item = parts[0];
		TreeNode root = new TreeNode(Integer.parseInt(item));
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.add(root);

		int index = 1;
		while (!nodeQueue.isEmpty()) {
			TreeNode node = nodeQueue.remove();

			if (index == parts.length) {
				break;
			}

			item = parts[index++];
			item = item.trim();
			if (!item.equals("null")) {
				int leftNumber = Integer.parseInt(item);
				node.left = new TreeNode(leftNumber);
				nodeQueue.add(node.left);
			}

			if (index == parts.length) {
				break;
			}

			item = parts[index++];
			item = item.trim();
			if (!item.equals("null")) {
				int rightNumber = Integer.parseInt(item);
				node.right = new TreeNode(rightNumber);
				nodeQueue.add(node.right);
			}
		}
		return root;
	}

	public static void prettyPrintTree(TreeNode node, String prefix, boolean isLeft) {
		if (node == null) {
			System.out.println("Empty tree");
			return;
		}

		if (node.right != null) {
			prettyPrintTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
		}

		System.out.println(prefix + (isLeft ? "└── " : "┌── ") + node.val);

		if (node.left != null) {
			prettyPrintTree(node.left, prefix + (isLeft ? "    " : "│   "), true);
		}
	}

	public static void draw(TreeNode node) {
		prettyPrintTree(node, "", true);
	}
}

class FastReader {
	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}
