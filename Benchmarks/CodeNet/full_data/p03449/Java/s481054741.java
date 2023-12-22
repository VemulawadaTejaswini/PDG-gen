import java.io.*;
import java.util.*;
public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[][] = new int[2][n];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		System.out.println(max(1, n - 1, nums));
	}
	public static int max(int y, int x, int[][] nums) {
		if(x == 0 && y == 0) return nums[0][0];
		if (x == 0) return nums[y][x] + nums[0][0];
		if (y == 0) return nums[y][x] + max(0, x - 1, nums);
		int num1 = max(0, x, nums);
		int num2 = max(1, x - 1, nums);
		return nums[y][x] + (num1 > num2 ? num1 : num2);
	}
}