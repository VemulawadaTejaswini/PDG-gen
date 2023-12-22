import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] a = new int[H][W];
		int[][] u = new int[H][W];
		StringBuilder ans = new StringBuilder();
		int N = 0;
		for(int i = 0; i < H; i++)
			for(int j = 0; j < W; j++)
				a[i][j] = sc.nextInt();
		int i = 0, j = 0;
		while(i < H && j < W) {
			if(a[i][j] % 2 == 1) {
				N++;
				if(i % 2 == 0) {
					if(j != W-1) {
						ans.append((i+1)+" "+(j+1)+" "+(i+1)+" "+(j+2)+"\n");
						a[i][j+1]++;
						j++;
					}
					else {
						ans.append((i+1)+" "+(j+1)+" "+(i+2)+" "+(j+1)+"\n");
						i++;
					}
				}
				else {
					if(j != 0) {
						ans.append((i+1)+" "+(j+1)+" "+(i+1)+" "+(j)+"\n");
						a[i][j-1]++;
						j--;
					}
					else {
						ans.append((i+1)+" "+(j+1)+" "+(i+2)+" "+(j+1)+"\n");
						i++;
					}
				}
			}
			else {
				if(i % 2 == 0) {
					if(j != W-1)
						j++;
					else
						i++;
				}
				else {
					if(j != 0)
						j--;
					else
						i++;
				}
			}
		}
		System.out.println(N);
		System.out.println(ans);
	}

}