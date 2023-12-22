
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		len = new int[n];
		
		for(int i = 0; i < n; i++) {
			len[i] = sc.nextInt();
		}
		
		group = new int[n];
		
		System.out.println(solve(0));
	}
	static int n;
	static int a, b, c;
	static int len[];
	static int group[];

	static int solve(int depth) {
		if(depth == n) {
			int cost = 0;
			int array[] = new int[4];
			for(int i = 0; i < n; i++) {
//				System.out.print(group[i]+" ");
				if(group[i] != 0 && array[group[i]] != 0) {
					cost += 10;
				}
				
				array[group[i]] += len[i];
			}
//			System.out.println();
			if(array[1] == 0 || array[2] == 0 || array[3] == 0) {
				return Integer.MAX_VALUE;
			}
			
//			for(int i = 1; i <= 3; i++) {
//				System.out.print(array[i]+" ");
//			}
//			System.out.println();
			
			cost += Math.abs(a - array[1]);
			cost += Math.abs(b - array[2]);
			cost += Math.abs(c - array[3]);
//			System.out.println(cost);
			return cost;
		}
		
		int result = Integer.MAX_VALUE;
		for(int i = 0; i < 4; i++) {
			group[depth] = i;
			result = Math.min(result, solve(depth + 1));
		}
		
		return result;
	}
}
