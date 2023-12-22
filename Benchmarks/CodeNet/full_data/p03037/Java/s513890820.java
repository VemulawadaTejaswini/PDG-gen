import java.util.Scanner;

class Pair<F, S>{
	F first;
	S second;
	public Pair(F f, S s) {
		first = f;
		second = s;
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] cover_gates = new int[N + 1];
		for(int i = 0; i < M; i++) {
			int L = sc.nextInt() - 1;
			int R = sc.nextInt();
			cover_gates[L]++;
			cover_gates[R]--;
		}
		for(int i = 1; i <= N; i++) {
			cover_gates[i] += cover_gates[i - 1];
		}
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(cover_gates[i] == M) cnt++;
		}
		System.out.println(cnt);
	}
}