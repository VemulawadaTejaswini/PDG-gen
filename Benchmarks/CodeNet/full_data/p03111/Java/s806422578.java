import java.util.Scanner;

public class Main {

	public int getUse(int index, int use) {
		return (use >> index * 2) & 0x3;
	}
	
	public int getCost(int N, int A, int B, int C, int[] li, int use) {
		int total = 0;
		int[] len = {0, 0, 0};
		
		for (int i=0; i<N; i++) {
			int u = getUse(i, use);
			if (u == 3) {
				continue;
			}
			if (len[u] != 0) {
				total += 10;
			}
			len[u] += li[i];
			
		}

		for (int i=0; i<len.length; i++) {
			if (len[i] == 0) {
				return Integer.MAX_VALUE;
			}
		}
		
		total += Math.abs(len[0] - A);
		total += Math.abs(len[1] - B);
		total += Math.abs(len[2] - C);
		
		return total;
	}
	
	public int solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int[] li = new int[N];
		
		for (int i=0; i<N; i++) {
			li[i] = in.nextInt();
		}
		
		in.close();
		
		int use = 1;
		int min = Integer.MAX_VALUE;
		while(true) {
			int cost = getCost(N, A, B, C, li, use);
			
			if (cost < min) {
				min = cost;
			}
			
			use++;
			if (use >= (0x1 << (N*2))) {
				break;
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		System.out.println(main.solve());
	}
}
