import java.util.Arrays;
import java.util.Scanner;

class State implements Comparable<State>{
	long a, b;
	public State(long _a, long _b) {
		a = _a; b = _b;
	}
	public int compareTo(State o) {
		return (int)(a - o.a);
	}
}

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt(), K = sc.nextInt();
		State[] arr = new State[(int)N];
		for(int i = 0; i < N; i++) {
			arr[i] = new State(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr);
		long cnt = 0, ans = -1;
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