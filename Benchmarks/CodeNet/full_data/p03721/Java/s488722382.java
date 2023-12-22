import java.util.Arrays;
import java.util.Scanner;

class State implements Comparable<State>{
	int a, b;
	public State(int _a, int _b) {
		a = _a; b = _b;
	}
	public int compareTo(State o) {
		return (int)Math.signum(a - o.a);
	}
}

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		State[] arr = new State[N];
		for(int i = 0; i < N; i++) {
			arr[i] = new State(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr);
		int cnt = 0, ans = -1;
		for(int i = 0; i < N; i++) {
			cnt += arr[i].b;
			if(cnt >= K) {
				ans = arr[i].a;
				break;
			}
		}
		System.out.println(ans);
	}
}