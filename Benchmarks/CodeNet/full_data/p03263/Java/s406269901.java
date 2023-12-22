import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String format = "%d %d %d %d";
		int[][] a = new int[H][W];
		for(int i = 0; i< H; i++)
			for(int j = 0; j < W; j++)
				a[i][j] = sc.nextInt();
		
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W-1; j++) {
				if(a[i][j] %2 == 0)
					continue;
				
				a[i][j+1]++;
				a[i][j]--;
				list.add(String.format(format, i,j,i,j+1));
			}
		}
		for(int i = 0; i < H -1; i++) {
			if(a[i][W-1] % 2 == 0)
				continue;
			
			a[i][W-1]--;
			a[i+1][W-1]++;
			list.add(String.format(format, i, W-1, i+1, W-1));
		}
		System.out.println(list.size());
		list.stream().forEach(System.out::println);
	}
}