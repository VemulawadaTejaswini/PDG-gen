import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Integer>[] list;

	static int[] counter;

	static boolean[] flag;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();

		list = new ArrayList[N + 1];
		for(int i = 1;i <= N;i++) {
			list[i] = new ArrayList<Integer>();
		}

		for(int i = 1;i <= N - 1;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			list[a].add(b);
		}

		counter = new int[N + 1];
		for(int i = 1;i <= Q;i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			counter[p] += x;
		}
		sc.close();

//		for(int i = 1;i <= N - 1;i++) {
//			System.out.println(list[i]);
//		}
//		for(int i = 1;i <= N;i++) {
//			System.out.println(counter[i]);
//		}

		flag = new boolean[N + 1];
		flag[1] = true;
		dfs(1);

		for(int i = 1;i <= N;i++) {
			System.out.println(counter[i]);
		}

	}

	private static void dfs(int x) {
		for(int y : list[x]) {
//			System.out.print(y);
//			System.out.println(flag[y]);
			if(!flag[y]) {
//				System.out.print(y);
//				System.out.println(counter[y]);
				counter[y] += counter[x];
				flag[y] = true;
				dfs(y);
			}
		}
	}
}