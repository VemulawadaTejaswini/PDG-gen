import java.util.Scanner;
import java.util.Stack;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] pres = sc.next().toCharArray();
		int n = pres.length;
		int[] s = new int[n];
		for(int i = 0; i < n; i++) {
			s[i] = Integer.parseInt(String.valueOf(pres[i]));
		}
		
		Stack<Task> stack = new Stack<Task>();
		stack.push(new Task(0, 0, 0));
		long ans = 0;
		while(!stack.isEmpty()) {
			Task t = stack.pop();
			int i = t.i;
			long x = t.x;
			long y = t.y * 10 + s[i];
			
			if(i == n - 1) {
				ans += x + y;
				continue;
			}
			stack.push(new Task(x * 10 + y, 0, i + 1));
			stack.push(new Task(x, y, i + 1));
		}
		
		System.out.println(ans);
	}
	
	static class Task {
		long x;
		long y;
		int i;
		
		Task(long x, long y, int i) {
			this.x = x;
			this.y = y;
			this.i = i;
		}
	}
}