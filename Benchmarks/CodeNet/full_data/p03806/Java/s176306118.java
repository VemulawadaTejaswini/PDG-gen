import java.util.*;

// ABC 54-D
// https://beta.atcoder.jp/contests/abc054/tasks/abc054_d

public class Main {

	static int answer = -1;
	static int N;
	static int Ma;
	static int Mb;
	static MyClass[] nums;
	static HashMap<String, Integer> memo;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		Ma = in.nextInt();
		Mb = in.nextInt();
		
		nums = new MyClass[N];
		for (int i = 0; i < N; i++) {
			nums[i] = new MyClass(in.nextInt(), in.nextInt(), in.nextInt());
		}

		memo = new HashMap<String, Integer>();
		solve(0, 0, 0, 0);
		System.out.println(answer);
	}
	
	public static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}
	
	public static boolean isSameRatio(int a, int b) {
		if (a == 0 || b == 0) {
			return false;
		}
		int gcd = gcd(a, b);
		return a / gcd == Ma && b / gcd == Mb;
	}
	
	public static void solve(int index, int a, int b, int c) {
		String key = a + "," + b + "," + index;
		if (memo.containsKey(key) && memo.get(key) >= c) {
			return;
		}
		if (isSameRatio(a, b)) {
			if (answer == -1) {
				answer = c;
			} else {
				answer = Math.min(answer, c);
			}
			memo.put(key, answer);
			return;
		}
		if (index == N) {
			return;
		}
		
		solve(index + 1, a, b, c);
		solve(index + 1, a + nums[index].a, b + nums[index].b, c + nums[index].c);
		
		memo.put(key, c);
	}
}

class MyClass {
	int a;
	int b;
	int c;
	
	public MyClass(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}