import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int H = Integer.parseInt(in.next());
		int W = Integer.parseInt(in.next());
		int[][] c = new int[10][10];
		for(int x = 0; x <= 9; x++){
			for(int y = 0; y <= 9; y++){
				c[x][y] = Integer.parseInt(in.next());
			}
		}
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				for(int k = 0; k < 10; k++){
					c[i][k] = Math.min(c[i][k],c[i][j] + c[j][k]);
				}
			}
		}
		int[] shortest = new int[10];
		int[] count = new int[10];
		for(int i = 0; i < 10; i++){
			count[i] = 0;
			shortest[i] = 1000000000;
				shortest[i] = Math.min(c[i][1],shortest[i]);
		}
		for(int i = 0; i < H * W; i++){
			int tmp = Integer.parseInt(in.next());
			if(tmp != -1)count[tmp]++;
		}
		int ans = 0;
		for(int i = 0;i <= 9; i++)ans += count[i]*shortest[i];
		System.out.println(ans);
	}
}