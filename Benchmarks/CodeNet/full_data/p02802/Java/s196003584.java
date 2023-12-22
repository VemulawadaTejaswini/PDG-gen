import java.util.*;

class Main {
	Scanner sc;
	int N, M;
	int[] stat;
	int[] penalty;
	
	private void calc() {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		stat = new int[N];
		penalty = new int[N];
		for (int i = 0; i < M; i++) {
			int p = sc.nextInt() - 1;
			String S = sc.next();
			switch (S) {
			case "WA":
				if (stat[p] == 0) penalty[p]++;
				break;
			case "AC":
				stat[p] = 1;
				break;
			default:
			}
		}
		int ac = 0;
		int pe = 0;
		for (int i = 0; i < N; i++) {
			if (stat[i] == 1) {
				ac++;
				pe += penalty[i];
			}
		}
		
		System.out.println(ac+" "+pe);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}