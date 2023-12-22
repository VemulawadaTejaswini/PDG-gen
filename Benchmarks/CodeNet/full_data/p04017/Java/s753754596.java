import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<Integer, Integer> hotels = new TreeMap<>();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
		    arr[i] = sc.nextInt();
		    hotels.put(arr[i], i);
		}
		hotels.put(0, 0);
		int length = sc.nextInt();
		int[][] matrix = new int[n + 1][31];
		for (int i = 0; i <= n; i++) {
		    matrix[i][0] = hotels.ceilingEntry(arr[i] - length).getValue();
		}
		for (int i = 1; i < 31; i++) {
		    for (int j = 0; j <= n; j++) {
		        matrix[j][i] = matrix[matrix[j][i - 1]][i - 1];
		    }
		}
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int days = 0;
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int target = Math.min(a, b);
		    int current = Math.max(a, b);
		    for (int j = 30; j >= 0; j--) {
		        if (matrix[current][j] >= target) {
		            days += (1 << j);
		            current = matrix[current][j];
		        }
		        if (current == target) {
		            break;
		        }
		    }
		    if (current > target) {
		        days++;
		    }
		    sb.append(days).append("\n");
		}
		System.out.print(sb);
    }
}

