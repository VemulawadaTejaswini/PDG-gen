import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long node[][] = new long[num][3];
		for(int i = 0; i < num; i ++) {
			node[i][0] = 0;
			node[i][1] = i + 1;
			node[i][2] = 0;
		}
		int edge[][] = new int[num - 1][2];
		for(int i = 0; i < num - 1; i ++) {
			int tmp = sc.nextInt() - 1;
			node[tmp][0] ++;
			edge[i][0] = tmp;
			tmp = sc.nextInt() - 1;
			node[tmp][0] ++;
			edge[i][1] = tmp;
		}
		Arrays.sort(node, (a, b) -> Long.compare(a[0], b[0]));

		long point[] = new long[num];
		for(int i = 0; i < num; i ++) {
			point[i] = sc.nextLong();
		}
		Arrays.sort(point);

		for(int i = 0; i < num; i ++) {
			node[i][2] = point[i];
		}

		Arrays.sort(node, (a, b) -> Long.compare(a[1], b[1]));

		long sum = 0;
		for(int i = 0; i < num - 1; i ++) {
			sum += Math.min(node[edge[i][0]][2], node[edge[i][1]][2]);
		}
		System.out.println(sum);

		for(int i = 0; i < num; i ++) {
			System.out.print(node[i][2]+" ");
		}
		System.out.println();
	}
}