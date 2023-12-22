import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int edge[][] = new int[num - 1][2];
		for(int i = 0; i < num - 1; i ++) {
			int tmp1 = sc.nextInt() - 1;
			int tmp2 = sc.nextInt() - 1;
			edge[i][0] = Math.min(tmp1, tmp2);
			edge[i][1] = Math.max(tmp1, tmp2);
		}
		Arrays.sort(edge, (a, b) -> Integer.compare(a[0], b[0]));

		int point[] = new int[num];
		long sum = 0;
		int max = 0;
		for(int i = 0; i < num; i ++) {
			point[i] = sc.nextInt();
			sum += point[i];
			max = Math.max(max, point[i]);
		}
		sum -= max;
		Arrays.sort(point);

		int deep[][] = new int[num][3];
		for(int i = 0; i < num; i ++) {
			deep[i][0] = num + 1000;
			deep[i][1] = i + 1;
			deep[i][2] = 0;
		}
		deep[0][0] = 0;
		for(int i = 0; i < num - 1; i ++) {
			deep[edge[i][1]][0] = Math.min(deep[edge[i][1]][0], deep[edge[i][0]][0] + 1);
		}
		Arrays.sort(deep, (a, b) -> Integer.compare(b[0], a[0]));

		for(int i = 0; i < num; i ++) {
			deep[i][2] = point[i];
		}

		Arrays.sort(deep, (a, b) -> Integer.compare(a[1], b[1]));

		System.out.println(sum);
		for(int i = 0; i < num; i ++) {
			System.out.print(deep[i][2]+" ");
		}
		System.out.println();
	}
}