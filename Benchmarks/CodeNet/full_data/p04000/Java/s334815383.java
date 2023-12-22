import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[][] table = new int[h - 2][];
		for(int i = 0; i < h - 2; i++)
			table[i] = new int[w - 2];
		int a, b;
		for(int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			for(int x = 1; x <= 3; x++) {
				for(int y = 1; y <= 3; y++) {
					if(a - x >= 0 && a - x < h - 2 && b - y >= 0 && b - y < w - 2)
						table[a - x][b - y]++;
				}
			}
		}
		for(int i = 0; i <= 9; i++) {
			long counter = 0;
			for(int j = 0; j < h - 2; j++) {
				for(int k = 0; k < w - 2; k++) {
					if(table[j][k] == i)
						counter++;
				}
			}
			System.out.println(counter);
		}
	}
}