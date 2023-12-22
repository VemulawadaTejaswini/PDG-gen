import java.util.*;
public class Main {

	static final long mod = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[] cat = new int[3*n];
		Arrays.fill(cat, -1);
		LinkedList<Character> st = new LinkedList<>();
		char wait = 0; int op = 0;
		for(int i = 0; i < 3*n; i++){
			if(s[i] == wait){
				cat[i] = 2;
				op--;
				if(op == 0){
					wait = 0;
				}
			}
			else if(st.isEmpty() || st.peek() == s[i]){
				st.addFirst(s[i]);
				cat[i] = 0;
			}
			else{
				char c = st.removeFirst();
				cat[i] = 1;
				wait = wait(c, s[i]);
				op++;
			}
		}
		
		long[] dp = new long[3*n];
		int free = n, opened = 0, middled = 0;
		for(int i = 0; i < 3*n; i++){
			if(cat[i] == 0){
				dp[i] = free; free--; opened++;
			}
			else if(cat[i] == 1){
				dp[i] = opened; opened--; middled++;
			}
			else{
				dp[i] = middled; middled--;
			}
		}
		
		long res = 1;
		for(long val: dp){
			res = (res * val) % mod;
		}
		System.out.println(res);
	}
	static char wait(char a, char b){
		if(a > b){
			char aux = a; a = b; b = aux;
		}
		if(a == 'G' && b == 'R') return 'B';
		if(a == 'B' && b == 'R') return 'G';
		else return 'R';
	}

}
