import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] a = new int[H][W];
		for(int i = 0;i < H;++i)
			for(int j = 0;j < W;++j)
				a[i][j] = sc.nextInt();
		sc.close();
		
		ArrayList<String> ans = new ArrayList<>();
		for(int i = 0;i < H;++i) {
			for(int j = 0;j < W-1;++j) {
				if(a[i][j] != 0 && a[i][j] % 2 != 0) {
					a[i][j]--;
					a[i][j+1]++;
					ans.add((i+1) + " " + (j+1) + " " + (i+1) + " " + (j+2));
				}
			}
		}
		
		for(int i = 0;i < H-1;++i) {
			if(a[i][W-1] != 0 && a[i][W-1] % 2 != 0) {
				a[i][W-1]--;
				a[i+1][W-1]++;
				ans.add((i+1) + " " + (W) + " " + (i+2) + " " + (W));
			}
		}
		
		System.out.println(ans.size());
		for(int i = 0;i < ans.size();++i)
			System.out.println(ans.get(i));
	}
}
