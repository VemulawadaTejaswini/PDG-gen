import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] T = new int[N];
		for(int i = 0;i < N;i++) {
			T[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		Arrays.sort(T);
		int bus = 1;
		int cnt = 1;
		for(int i = 1;i < N;i++) {
			cnt++;
			if(cnt == C || T[i] > T[i-1]+K) {
				bus++;
				cnt = 0;
			}
		}
		System.out.println(bus);
	}
}