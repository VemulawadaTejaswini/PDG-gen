import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	static long MOD = (long) (1e9 + 7);
	static Random random = new Random();
	  
	static boolean isAnswerFound = false;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		int sum = 0;
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			nums.add(in.nextInt());
			sum += nums.get(i);
		}
		int count = 0;
		for (int i = 0; i < N && count < M; i++) {
			if (nums.get(i) >= (sum / (4.0 * M))) {
				count++;
			}
		}
		System.out.println(count == M ? "Yes" : "No");
	}
	
	public static void solve(FastReader in) {
		char[] s = in.next().toCharArray();
		
		List<Integer> open = new ArrayList<Integer>();
		List<Integer> close = new ArrayList<Integer>();
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '(') {
				open.add(i);
			} else {
				close.add(i);
			}
		}
		
		if (open.size() > 0 && close.size() > 0 && open.get(0) < close.get(close.size() - 1)) {
			System.out.println(1);
			int index = 1;
			while (open.size() > index && close.size() > index && open.get(index) < close.get(close.size() - index - 1)) {
				index++;
			}
			System.out.println(index * 2);
			for (int i = 0; i < index; i++) {
				System.out.printf("%d ", open.get(i) + 1);
			}
			for (int i = close.size() - index; i < close.size(); i++) {
				System.out.printf("%d ", close.get(i) + 1);
			}
		} else {
			System.out.println(0);
		}
	}
	
	public static void rec(int[] nums, int[] newnums, int index, String s, int M) {
		if (isAnswerFound) {
			return;
		}
		if (index == nums.length) {
			if (isValid(newnums, s, M)) {
				isAnswerFound = true;
			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] >= 0) {
					int tmp = nums[i];
					nums[i] = -1;
					newnums[index] = tmp;
					rec(nums, newnums, index + 1, s, M);
					nums[i] = tmp;
				}
			}
		}
	}
	
	public static boolean isValid(int[] nums, String s, int M) {
//		printNumArray(nums);
		HashMap<Character, Long> unknownMap = new HashMap<>();
		Stack<CustomClass> stack = new Stack<CustomClass>();
		// 1 => number, 2 => op, 3 => parenthesis 
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// No number in string, so just look at character by character
			if (c == '(') {
				CustomClass cc = new CustomClass(3);
				stack.add(cc);
			} else if (c == ')') {
				CustomClass keep = stack.pop();
				CustomClass tmp = stack.pop();
				// If it's an opening parenthesis, just replace it with the result of the expression
				if (tmp.type == 3) {
					stack.add(keep);
				}
				// It was an op
				else if (tmp.type == 2) {
					keep.n = exp(stack.pop().n, keep.n, tmp.op);
					// Remove the starting parenthesis
					stack.pop();
					stack.add(keep);
				} else {
					// Should not reach here
					out("This is unexpected");
				}
			} else if (c == '+' || c == '-' || c == '*') {
				CustomClass cc = new CustomClass(2);
				cc.op = c;
				stack.add(cc);
			} else {
				long n = -1;
				if (unknownMap.containsKey(c)) {
					n = unknownMap.get(c);
				} else {
					n = nums[unknownMap.size()];
					unknownMap.put(c, n);
				}
				
				// If we can compute the result, compute the result
				if (stack.size() > 0 && stack.peek().type == 2) {
					CustomClass op = stack.pop();
					n = exp(stack.pop().n, n, op.op);
					// Add the result of expression back to the result
					CustomClass cc = new CustomClass(1);
					cc.n = n;
					stack.add(cc);
				} else {
					CustomClass cc = new CustomClass(1);
					cc.n = n;
					stack.add(cc);
				}
			}
		}
		
		return stack.pop().n == M;
	}
	
	public static long exp(long a, long b, char op) {
		if (op == '+') {
			return a + b;
		} else if (op == '-') {
			return a - b;
		} else if (op == '*') {
			return a * b;
		} else {
			out("Unknown operation");
			return a;
		}
	}
	
	public static int maxSideLength(int[][] mat, int threshold) {
		if (mat == null || mat.length == 0 || mat[0].length == 0) {
			return 0;
		}
		
		int M = mat.length;
		int N = mat[0].length;
		
		// Precompute the sum
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = getAt(mat, i, j) + getAt(mat, i - 1, j) + getAt(mat, i, j - 1) - getAt(mat, i - 1, j - 1);
			}
		}
		
		int ans = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 1; i + k < M && j + k < N; k++) {
					int area = getAt(mat, i + k, j + k) - getAt(mat, i + k, j - 1) - getAt(mat, i - 1, j + k) + getAt(mat, i - 1, j - 1);
					if (area <= threshold) {
						ans = Math.max(ans, k + 1);
					}
				}
			}
		}
		
		return ans;
	}
	
	public static int getAt(int[][] mat, int i, int j) {
		if (i < 0 || j < 0) return 0;
		return mat[i][j];
	}
	
    public static List<Integer> findAnagrams(String s, String p) {
    	List<Integer> ans = new ArrayList<Integer>();
        
    	int[] pfreq = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pfreq[p.charAt(i) - 'a']++;
        }
        
        int[] sfreq = new int[26];
        for (int i = 0; i < p.length() && i < s.length(); i++) {
        	sfreq[s.charAt(i) - 'a']++;
        }
        
        // key is in the format character###,
        String pkey = "";
        String skey = "";
        
        for (int i = 0; i < 26; i++) {
        	pkey += String.format("%c%d,", i + 'a', pfreq[i]);
        	skey += String.format("%c%d,", i + 'a', sfreq[i]);
        }
        
        for (int i = p.length(); i < s.length(); i++) {
        	char removed = s.charAt(i - p.length());
        	char added = s.charAt(i);
        	
        	
        }
        
        return ans;
    }

	public static int count(String[] arr, Map<String, Map<Character, TreeSet<Integer>>> map, String s) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (subsequence(s, map.get(arr[i]))) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean subsequence(String s, Map<Character, TreeSet<Integer>> map) {
		char f = s.charAt(0);
		char m = s.charAt(1);
		char e = s.charAt(2);
		if (!map.containsKey(f) || !map.containsKey(m) || !map.containsKey(e)) {
			return false;
		}
		
		Iterator<Integer> it = map.get(m).iterator();
		while (it.hasNext()) {
			int index = it.next();
			if (map.get(f).lower(index) != null && map.get(e).higher(index) != null) {
				return true;
			}
		}
		
		return false;
	}
	
	public static String str(int i, int j, int k) {
		return String.format("%c%c%c", c(i), c(j), c(k));
	}
	
	public static char c(int i) {
		if (i < 26) {
			return (char) ('A' + i);
		} else {
			i -= 26;
			return (char) ('a' + i);
		}
	}
	
	public static int sol(int N, int k) {
		if (N == 1 && k == 1) return 1;
		int parent = sol(N - 1, (k + 1) / 2);
		if (k % 2 == 0) {
			return (parent + 1) % 2;
		} else {
			return parent;
		}
	}
	
	public static double calculate(double base, double n) {
        return Math.pow(Math.E, Math.log(base)/n);
    }
	
	public static int partition(int[] nums, int low, int high) { // [1,2], 0, 1
		// Pick the first element as pivot
		// int pivot = nums[low]; // 1
		//
		// int left = low + 1; // 2
		// int right = high; // 1
		//
		//
		// while (left <= right) { // This equal to is important to move right
		// cursor left cursor correct position
		// if (nums[left] <= pivot) {
		// left++;
		// continue;
		// }
		// if (pivot <= nums[right]) {
		// right--;
		// continue;
		// }
		// int tmp = nums[left];
		// nums[left] = nums[right];
		// nums[right] = tmp;
		// }
		// int tmp = nums[low];
		// nums[low] = nums[right];
		// nums[right] = tmp;
		//
		// return right;

		// Pick the last element as pivot
		int pivot = nums[high];

		int left = low;
		int right = high - 1;

		while (left <= right) {
			if (nums[left] <= pivot) {
				
				left++;
				continue;
			}
			if (pivot <= nums[right]) {
				right--;
				continue;
			}
			int tmp = nums[left];
			nums[left] = nums[right];
			nums[right] = tmp;
		}
		int tmp = nums[high];
		nums[high] = nums[left];
		nums[left] = tmp;

		return left;
	}

	// Pivot is the first element
	public static int partitionFront(int[] nums, int low, int high) {
		int pivot = nums[low];

		int left = low + 1;

		while (left <= high) {
			// Increment left until it reaches the element greater than pivot
			while (left <= high && nums[left] <= pivot)
				left++;
			while (left <= high && nums[high] >= pivot)
				high--;

			if (left < high) {
				int tmp = nums[left];
				nums[left] = nums[high];
				nums[high] = tmp;
			}
		}
		int tmp = nums[low];
		nums[low] = nums[high];
		nums[high] = tmp;

		return high;
	}

	// Pivot is the last element
	public static int partitionBack(int[] nums, int low, int high) {
		int pivot = nums[high];

		int right = high - 1;

		while (low <= right) {
			// Increment low until it is greater than pivot
			while (low <= right && nums[low] <= pivot)
				low++;
			// Decrement right until it is less than pivot
			while (low <= right && nums[right] >= pivot)
				right--;

			if (low < right) {
				int tmp = nums[low];
				nums[low] = nums[right];
				nums[right] = tmp;
			}
		}

		int tmp = nums[low];
		nums[low] = nums[high];
		nums[high] = tmp;

		return low;
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

	public static void printListNode(ListNode node) {
		boolean first = true;
		while (node != null) {
			if (!first) {
				print("->");
			}
			print(node.val);
			node = node.next;
			first = false;
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

class CustomClass {
	int type; // 1 => number, 2 => op, 3 => parenthesis
	// parenthesis will be stored in op
	char op;
	long n;
	
	public CustomClass(int type) {
		this.type = type;
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

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class FastReader { 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader() 
    { 
        br = new BufferedReader(new
                 InputStreamReader(System.in)); 
    } 

    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 

    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 

    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 

    double nextDouble() 
    { 
        return Double.parseDouble(next()); 
    } 

    String nextLine() 
    { 
        String str = ""; 
        try
        { 
            str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str; 
    } 
} 
