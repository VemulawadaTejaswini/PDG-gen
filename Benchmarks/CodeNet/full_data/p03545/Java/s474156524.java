import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	int[] A;
	int ans = 0;
	String[] op; 
	boolean flag = false;
	
	
	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = new char[4];
		op = new String[3];
		c = s.toCharArray();
		A = new int[4];
		A[0] = c[0] - '0';
		A[1] = c[1] - '0';
		A[2] = c[2] - '0';
		A[3] = c[3] - '0';
		dfs(0);
		sc.close();
	}
	
	void dfs(int pos) {
		if(pos == 3) {
			ans = A[0];
			for(int i = 0; i < 3; i++) {
				if(op[i] == "+") ans += A[i+1];
				else if(op[i] == "-") ans -= A[i+1];
			}
			if(ans == 7) {
				System.out.print(A[0] + op[0] + A[1] + op[1] + A[2] + op[2] + A[3]);
				System.out.println("=7");
				flag = true;
			}
			return;
		}
		if(!flag) {
			op[pos] = "+";
			dfs(pos+1);
		}
		if(!flag) {
			op[pos] = "-";
			dfs(pos+1);	
		}
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}