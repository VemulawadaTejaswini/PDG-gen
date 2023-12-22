import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int edge[][] = new int[num - 1][2];
		for(int i = 0; i < num - 1; i ++) {
			edge[i][0] = sc.nextInt() - 1;
			edge[i][1] = sc.nextInt() - 1;
		}

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

		int ans[] = new int[num];
		for(int i = 0; i < num; i ++) {
			ans[i] = -1;
		}
		ans[0] = point[num - 1];

		for(int i = 1; i < num; i ++) {
			for(int j = 0; j < num - 1; j ++) {
				if(ans[edge[j][0]] >= 0 && ans[edge[j][1]] < 0) {
					ans[edge[j][1]] = point[num - i - 1];
					break;
				}
				if(ans[edge[j][0]] < 0 && ans[edge[j][1]] >= 0) {
					ans[edge[j][0]] = point[num - i - 1];
					break;
				}
			}
		}

		System.out.println(sum);
		for(int i = 0; i < num; i ++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();
	}
}